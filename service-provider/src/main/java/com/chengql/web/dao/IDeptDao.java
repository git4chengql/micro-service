package com.chengql.web.dao;

import com.chengql.web.vo.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by qlcheng on 2018/3/21.
 */
public interface IDeptDao extends JpaRepository<Dept, Long> {
}