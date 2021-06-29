package com.totyu.totyudemo.mapper;

import com.totyu.totyudemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 学生持久层接口
 */
@Mapper
public interface StudentMapper {

    /**
     * 根据学生编号删除学生
     *
     * @param id 学生编号
     * @return 受影响的行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入学生
     *
     * @param student 学生实体
     * @return 受影响的行数
     */
    int insert(Student student);

    /**
     * 根据学生编号查找学生
     *
     * @param id 学生编号
     * @return 学生实体
     */
    Student selectByPrimaryKey(Integer id);

    /**
     * 查找所有学生
     *
     * @return 学生列表
     */
    List<Student> selectAll();

    /**
     * 根据主键更新学生
     *
     * @param student 学生实体
     * @return 受影响的行数
     */
    int updateByPrimaryKey(Student student);
}
