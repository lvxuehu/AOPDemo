package com.lly.aop.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 14-4-22
 * Time: 上午11:31
 */
public class ClientTest {
    public static void main(String[] args){
        StudentInfoService studentInfo= (StudentInfoService)AOPFactory.getAOPProxyedObject("com.lly.aop.demo.StudentInfoServiceImpl");
        studentInfo.findInfo("阿飞");

    }
}
