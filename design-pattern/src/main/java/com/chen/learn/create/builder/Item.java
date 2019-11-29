package com.chen.learn.create.builder;

/**
 * 食物条目和食物包装
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public interface Item {

    /**
     * 获取名称
     * @return 名称
     */
    String name();

    /**
     * 包装
     * @return 包装
     */
    Packing packing();

    /**
     * 价格
     * @return 价格
     */
    float price();

}
