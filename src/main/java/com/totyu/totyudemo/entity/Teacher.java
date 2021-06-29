package com.totyu.totyudemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * 老师表
 * @author xkl
 * @createtime 2021-06-29 17:59:08
 * */
@Data
@TableName("teacher")
public class Teacher extends Model<Teacher> {
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


    /**
     *
     * 获取老师编号
     */
    public Integer getId() {
        return id;
    }


    /**
     *
     * 设置老师编号
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     *
     * 获取老师姓名
     */
    public String getName() {
        return name;
    }


    /**
     *
     * 设置老师姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *
     * 获取老师年龄
     */
    public Integer getAge() {
        return age;
    }


    /**
     *
     * 设置老师年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }


    /**
     *
     * 获取老师性别
     */
    public Integer getGender() {
        return gender;
    }


    /**
     *
     * 设置老师性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }


    /**
     *
     * 获取老师出勤
     */
    public Integer getAttendance() {
        return attendance;
    }


    /**
     *
     * 设置老师出勤
     */
    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }
}