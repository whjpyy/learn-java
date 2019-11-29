package com.chen.learn.construct;

/**
 * vlc播放器
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name：" + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
