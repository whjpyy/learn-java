package com.chen.learn.construct;

/**
 * 音频播发器
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if (MediaAdapter.MP3.equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name：" + filename);
        } else if (MediaAdapter.VLC.equalsIgnoreCase(audioType) || MediaAdapter.MP4.equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
