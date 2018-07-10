package com.chengql.web.service.impl;

import com.chengql.web.dao.IDeptDao;
import com.chengql.web.service.IDeptService;
import com.chengql.web.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chengql
 * @create 2018-03-21 下午4:56
 **/
@Component
public class DeptService implements IDeptService {

    @Autowired
    private IDeptDao dao;

    public List<Dept> getAll() {
        return dao.findAll();
    }
}
