package com.chen.learn.create.single;

/**
 * 懒汉式，双重检验锁
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Singleton4 {

    private Singleton4(){}
    private volatile static Singleton4 singleton = null;
    public static Singleton4 getInstance(){
        if(singleton == null){
            synchronized (Singleton4.class){
                if(singleton == null){
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
