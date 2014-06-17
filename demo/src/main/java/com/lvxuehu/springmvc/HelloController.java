package com.lvxuehu.springmvc;

import com.lvxuehu.mybatis.domain.LoginUser;
import com.lvxuehu.mybatis.service.LoginUserServiceImpl;
import com.lvxuehu.mybatis.service.impl.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-9-26
 * Time: 下午3:20
 */
@Controller
public class HelloController {


    @Autowired
    LoginUserService loginUserService;


    @RequestMapping(value = "hello.do")
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        LoginUser user = loginUserService.getUserById(1);
        System.out.println("user=" + user.getName());


        request.setAttribute("hello_1", "你好啊, Spring!");
        request.setAttribute("hello_2", user.getName());


        return new ModelAndView("/jsp/hello");
    }

    @RequestMapping(value = "insertuser.do")
    public ModelAndView insertuserRequest(HttpServletRequest request,
                                          HttpServletResponse response,
                                          @ModelAttribute("tempUser") LoginUser tempUser, @RequestParam String intro) throws Exception {

       System.out.println("tempUser=" + tempUser.getName()+"中午");
        loginUserService.insertUser(tempUser);

        request.setAttribute("hello_2", "插入成功!");
        return new ModelAndView("/jsp/hello");
    }

}
