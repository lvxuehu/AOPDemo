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
        System.out.println("your name is :"+studentName);    }
}
