package com.lvxuehu.mybatis.service;

import com.lvxuehu.mybatis.domain.LoginUser;
import com.lvxuehu.mybatis.mapper.LoginUserMapper;
import com.lvxuehu.mybatis.service.impl.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-9-30
 * Time: 上午10:15
 */


@Service
public class LoginUserServiceImpl implements LoginUserService {

    @Resource(name = "loginUserMapper")
    private LoginUserMapper loginUserMapper;

    public LoginUser getUserById(int id){
        return  loginUserMapper.getUserById(1);
    }


    public void insertUser(LoginUser loginUser){
        loginUserMapper.insertUser(loginUser);
    }


}
