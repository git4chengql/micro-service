package com.chengql.web.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author chengql
 * @create 2018-03-21 上午10:32
 **/
@Entity
@Table(name="dept")
public class Dept implements Serializable {
    @Id
    @GeneratedValue
    private Long deptno;
    private String dname;
    private String loc;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc
                + "]";
    }
}