package com.totyu.totyudemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.totyu.totyudemo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 老师持久层接口
 *
 */

@Mapper
public interface TeacherMapper {
    /**
     * 通过ID删除老师
     * @param id 老师编号
     * @return 影响行数
     * @createTime 2021-06-29 18:50
     */
    int deleteTeacherById(Integer id);

    /**
     * 通过传入teacher对象插入老师
     * @param teacher 老师对象
     * @return 影响行数
     * @createTime 2021-06-29 18:50
     */
    int insertTeacher(Teacher teacher);

    /**
     * 通过ID查询老师
     * @param id 老师编号
     * @return 老师对象
     * @createTime 2021-06-29 18:50
     */
    Teacher selectTeacherById(Integer id);

    /**
     * 查询所有老师
     * @param 无
     * @return 老师对象集合
     * @createTime 2021-06-29 18:50
     */
    List<Teacher> selectTeacherList();

    /**
     * 通过传入 teacher 对象更新老师数据
     * @param teacher 老师对象
     * @return 影响行数
     * @createTime 2021-06-29 18:50
     */
    int updateTeacherById(Teacher teacher);

    /**
     * 通过传入关键字 查询老师集合
     * @param name 关键字
     * @return 老师集合
     * @createTime 2021-06-29 18:50
     */
    List<Teacher> selectTeacherByName(String name);






}