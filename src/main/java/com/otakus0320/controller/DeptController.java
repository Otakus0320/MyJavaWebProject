package com.otakus0320.controller;

import com.otakus0320.pojo.Dept;
import com.otakus0320.pojo.Result;
import com.otakus0320.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    // list
    @GetMapping
    public Result list(){

        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

    // delete
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        deptService.delete(id);
        return Result.success();
    }

    // add
    @PostMapping
    public Result add(@RequestBody Dept dept){
        deptService.insert(dept);
        return Result.success();
    }

    // search
    @GetMapping("/{id}")
    public Result search(@PathVariable Integer id){
        Dept searchDept = deptService.search(id);
        return Result.success(searchDept);
    }

    // update
    @PutMapping
    public Result update(@RequestBody Dept dept){
        deptService.update(dept);
        return Result.success();
    }

}
