package com.lvxuehu.mybatis.mapper;

import com.lvxuehu.mybatis.domain.LoginUser;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-9-30
 * Time: 上午10:03
 */

public interface LoginUserMapper {
    LoginUser getUserById(int id);

    void insertUser(LoginUser loginUser);
}
