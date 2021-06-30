package com.totyu.totyudemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 老师表
 *
 * */
@Data
@TableName("teacher")
public class Teacher {

    public Teacher(Integer id, String name, Integer age, Integer gender, Integer attendance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.attendance = attendance;
    }

    /**
     *
     * 老师编号
     */
    private Integer id;

    /**
     *
     * 老师姓名
     */
    private String name;

    /**
     *
     * 老师年龄
     */
    private Integer age;

    /**
     *
     * 老师性别
     */
    private Integer gender;

    /**
     *
     * 老师是否出勤
     */
    private Integer attendance;



}