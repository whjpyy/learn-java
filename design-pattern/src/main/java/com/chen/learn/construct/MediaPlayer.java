package com.chen.learn.construct;

/**
 * 媒体播放器
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public interface MediaPlayer {

    /**
     * 播放
     * @param audioType 音频类型
     * @param filename 文件名称
     */
    void play(String audioType, String filename);
}
