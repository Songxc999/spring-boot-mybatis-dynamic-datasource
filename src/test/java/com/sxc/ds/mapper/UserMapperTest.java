package com.sxc.ds.mapper;

import com.sxc.ds.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void save() {
        User user = new User();
        user.setUsername("master1");
        user.setPassword("master1");
        user.setSex(0);
        user.setAge(18);
        Assert.assertEquals(1, userMapper.save(user));
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(1L);
        user.setPassword("newpassword11");
        // 返回插入的记录数 ，期望是1条 如果实际不是一条则抛出异常
        Assert.assertEquals(1,userMapper.update(user));
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void selectById() {
        User user = userMapper.selectById(2L);
        log.info("result: {}", user);
    }

    @Test
    public void selectAll() {
        List<User> users = userMapper.selectAll();
        log.info("result: {}", users);
    }
}
