package com.lly.aop.demo;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 14-4-22
 * Time: 上午11:31
 */
public class AOPFactory   {
    private static Object getClassInstance(String clzName){
        Object obj=null;
        try{
            Class cls=Class.forName(clzName);//类装载器，根据clzName的路径，读取类的字节码，在jvm的堆中申请空间，之后初始化类中得静态变量和静态代码块，这时候只是装载class字节码，还没有实例化对象。注意与ClassLoader.loadClass的区别。
            obj=(Object)cls.newInstance();//这个方法就是实例化的过程，相当于new Object的写法。newInstance的问题构造方法不能带参数。
        }catch(ClassNotFoundException cnfe){
            System.out.println("ClassNotFoundException:"+cnfe.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }
        return obj;
    }
    public static Object getAOPProxyedObject(String clzName){
        Object proxy=null;//代理对象
        MyHandler handler=new MyHandler();
        Object obj=getClassInstance(clzName);
        if(obj!=null) {
            proxy=handler.bind(obj);
        }else{
            System.out.println("Can't get the proxyobj");
//throw
        }
        return proxy;
    }
}
