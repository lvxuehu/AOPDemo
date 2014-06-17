package com.lvxuehu.mybatis.domain;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-9-30
 * Time: 上午10:04
 */
public class LoginUser implements Serializable {
    private static final long serialVersionUID = 8751282105532159742L;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
