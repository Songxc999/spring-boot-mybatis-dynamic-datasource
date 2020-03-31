package com.sxc.ds.domain;

import lombok.Data;

/**
 * @author Songxc
 * @date 2020/3/31 9:13
 */
@Data
public class User {

    private Long id;

    private Integer age;

    private String password;

    private Integer sex;

    private String username;
}
