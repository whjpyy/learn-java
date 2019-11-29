package com.chen.learn.create.single;

/**
 * 饿汉模式，线程安全
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Singleton3 {

    private Singleton3(){}
    private static Singleton3 singleton = new Singleton3();
    public static Singleton3 getInstance(){
        return singleton;
    }
}
