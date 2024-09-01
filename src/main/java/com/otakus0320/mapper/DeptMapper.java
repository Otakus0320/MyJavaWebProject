package com.otakus0320.mapper;

import com.otakus0320.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("SELECT * FROM dept")
    List<Dept> list();

    @Delete("DELETE FROM dept WHERE id = #{id}")
    void deleteById(Integer id);

    @Insert("INSERT into dept(name, create_time, update_time) VALUES (#{name}, #{createTime}, #{updateTime})")
    void insert(Dept dept);

    @Select("SELECT * FROM dept WHERE id = #{id}")
    Dept search(Integer id);

    void update(Dept dept);
}
