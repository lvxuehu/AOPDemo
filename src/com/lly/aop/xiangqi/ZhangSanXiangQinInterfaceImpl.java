package com.lly.aop.xiangqi;

/**
 * 张三相亲实现类
 *
 * @author zhengt
 * @time Jun 3, 2095 3:14:48 PM
 */
public class ZhangSanXiangQinInterfaceImpl implements XiangQinInterface {
    @Override
    public void xiangQin() {
        System.out.println("张三去相亲，娶个漂亮老婆。");
    }
}
