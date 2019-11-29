package com.chen.learn.create.prototype;

/**
 * 形状
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    /**
     * 画
     */
    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
