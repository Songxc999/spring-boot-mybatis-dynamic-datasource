package com.sxc.ds.mapper;

import com.sxc.ds.annotation.DataSource;
import com.sxc.ds.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Songxc
 * @date 2020/3/31 9:13
 */
@Repository
public interface UserMapper {
    /**
     * 新增用户
     * @param user
     * @return
     */
    @DataSource
    //默认数据源
    int save(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @DataSource  //默认数据源
    int update(User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @DataSource  //默认数据源
    int deleteById(Long id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @DataSource("slave1")  //slave1
    User selectById(Long id);

    /**
     * 查询所有用户信息
     * @return
     */
    @DataSource("slave1")  //slave2
    List<User> selectAll();
}
