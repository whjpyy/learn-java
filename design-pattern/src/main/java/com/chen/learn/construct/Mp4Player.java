package com.chen.learn.construct;

/**
 * mp4播发器
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing Mp4 file. Name : " + filename);
    }
}
