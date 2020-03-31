package com.sxc.ds;

import com.sxc.ds.config.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(DynamicDataSourceRegister.class)
@MapperScan("com.sxc.ds.mapper")
@SpringBootApplication
public class SpringBootMybatisDynamicDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisDynamicDatasourceApplication.class, args);
    }

}
