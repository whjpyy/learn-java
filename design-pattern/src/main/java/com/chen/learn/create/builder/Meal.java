package com.chen.learn.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 点餐
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    /**
     * 加入一项
     * @param item 一项
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 总价格
     * @return
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 显示菜单
     */
    public void showItems(){
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }


}
