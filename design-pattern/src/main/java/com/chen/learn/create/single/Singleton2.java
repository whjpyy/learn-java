package com.chen.learn.create.single;

/**
 * 懒汉式，线程安全
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Singleton2 {

    private Singleton2(){}
    private static Singleton2 singleton = null;
    public static synchronized Singleton2 getInstance(){
        if(singleton == null){
            singleton = new Singleton2();
        }
        return singleton;
    }
}
