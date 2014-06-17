package com.lvxuehu.mybatis.service.impl;

import com.lvxuehu.mybatis.domain.LoginUser;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-9-30
 * Time: 下午1:04
 */
public interface LoginUserService {
    public LoginUser getUserById(int id);

    void insertUser(LoginUser loginUser);
}
