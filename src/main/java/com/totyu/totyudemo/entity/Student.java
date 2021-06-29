package com.totyu.totyudemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生实体类
 *
 * @author unresolved
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    /**
     * 学生编号
     */
    private Integer id;

    /**
     * 学生名字
     */
    private String name;

    /**
     * 学生年龄
     */
    private Integer age;

    /**
     * 学生性别
     */
    private Integer gender;

}
