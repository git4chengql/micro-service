package com.chengql.web.controller;

import com.chengql.web.service.IDeptService;
import com.chengql.web.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chengql
 * @create 2018-03-21 下午4:57
 **/
@RestController
@RequestMapping("/dept/")
public class DeptController {

    @Autowired
    private IDeptService service;

    /**
     * 获取全部数据
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Dept> getAll(){
        return service.getAll();
    }
}
