package com.otakus0320.mapper;

import com.otakus0320.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

}
