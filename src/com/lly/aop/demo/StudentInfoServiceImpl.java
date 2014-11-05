package com.lly.aop.demo;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 14-4-22
 * Time: 上午11:35
 */
public class StudentInfoServiceImpl implements StudentInfoService {
    @Override
    public void findInfo(String studentName) {
        System.out.println("\nyour name is :"+studentName);
    }

    @Override
    public void getName(String uname) {
        System.out.println("\n---------your name is :"+uname);
    }


}
