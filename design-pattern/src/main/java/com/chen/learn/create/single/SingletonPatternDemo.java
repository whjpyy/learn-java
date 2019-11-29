package com.chen.learn.create.single;

/**
 * 单例模式
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance() == Singleton1.getInstance());
        System.out.println(Singleton2.getInstance() == Singleton2.getInstance());
        System.out.println(Singleton3.getInstance() == Singleton3.getInstance());
        System.out.println(Singleton4.getInstance() == Singleton4.getInstance());
        System.out.println(Singleton5.getInstance() == Singleton5.getInstance());
        System.out.println(Singleton6.INSTACE == Singleton6.INSTACE);
    }
}
