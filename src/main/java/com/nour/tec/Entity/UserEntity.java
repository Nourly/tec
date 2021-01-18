package com.nour.tec.Entity;


import lombok.Data;

import java.util.Date;

/**
 * @author Xubo
 * @date 2021/1/18 19:26
 */
@Data
public class UserEntity {

    private Long id;

    private String guid;

    private String name;

    private String age;

    private Date createTime;

}
