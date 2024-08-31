package com.otakus0320.service;

import com.otakus0320.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    void delete(Integer id);

    void insert(Dept dept);

    Dept search(Integer id);

    void update(Dept dept);
}
