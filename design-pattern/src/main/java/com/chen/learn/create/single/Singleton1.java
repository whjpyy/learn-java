package com.chen.learn.create.single;

/**
 * 懒汉式，现场不安全
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Singleton1 {

    private Singleton1(){}
    private static Singleton1 singleton = null;
    public static Singleton1 getInstance(){
        if(singleton == null){
            singleton = new Singleton1();
        }
        return singleton;
    }
}
