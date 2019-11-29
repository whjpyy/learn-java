package com.chen.learn.construct;

/**
 * 更高级的播放器
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public interface AdvanceMediaPlayer {

    /**
     * 播放Vlc
     * @param filename
     */
    void playVlc(String filename);

    /**
     * 播放mp4
     * @param filename
     */
    void playMp4(String filename);
}
