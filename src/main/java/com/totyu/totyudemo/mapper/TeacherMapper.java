package com.totyu.totyudemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.totyu.totyudemo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 老师持久层接口
 * @author xkl
 * @createTime 2021-06-29 18:01
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
    /**
     * 通过ID删除老师
     * @param id 老师编号
     * @return 影响行数
     * @author xkl
     * @createTime 2021-06-29 18:50
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 通过传入record对象插入老师
     * @param record 老师对象
     * @return 影响行数
     * @author xkl
     * @createTime 2021-06-29 18:50
     */
    int insert(Teacher record);

    /**
     * 通过ID查询老师
     * @param id 老师编号
     * @return 老师对象
     * @author xkl
     * @createTime 2021-06-29 18:50
     */
    Teacher selectByPrimaryKey(Integer id);

    /**
     * 查询所有老师
     * @param 无
     * @return 老师对象集合
     * @author xkl
     * @createTime 2021-06-29 18:50
     */
    List<Teacher> selectAll();

    /**
     * 通过传入 record 对象更新老师数据
     * @param record 老师对象
     * @return 影响行数
     * @author xkl
     * @createTime 2021-06-29 18:50
     */
    int updateByPrimaryKey(Teacher record);

    /**
     * 通过传入关键字 查询老师集合
     * @param name 关键字
     * @return 老师集合
     * @author xkl
     * @createTime 2021-06-29 18:50
     */
    List<Teacher> selectFilterAll(String name);






}