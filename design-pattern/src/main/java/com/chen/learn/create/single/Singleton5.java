package com.chen.learn.create.single;

/**
 * 登记式/静态内部类
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Singleton5 {
    private static class SingletonHolder{
        private static final Singleton5 instance = new Singleton5();
    }
    private Singleton5(){};
    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
}
