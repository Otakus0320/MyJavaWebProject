package com.otakus0320.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.otakus0320.mapper.EmpMapper;
import com.otakus0320.pojo.Emp;
import com.otakus0320.pojo.PageBean;
import com.otakus0320.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize,
                         String name, Short gender, LocalDate begin, LocalDate end) {

        PageHelper.startPage(page, pageSize);

        List<Emp> list = empMapper.list(name, gender, begin, end);

        Page<Emp> p = (Page<Emp>) list;

        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());

        return pageBean;
    }

}
