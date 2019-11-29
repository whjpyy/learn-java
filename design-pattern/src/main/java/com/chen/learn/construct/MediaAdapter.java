package com.chen.learn.construct;

/**
 * 媒体适配器
 *
 * @author chenyouzeng
 * @date 2019/11/29
 */
public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;
    public static String VLC = "vlc";
    public static String MP4 = "mp4";
    public static String MP3 = "mp3";

    public MediaAdapter(String audioType){
        if(VLC.equalsIgnoreCase(audioType)){
            advanceMediaPlayer = new VlcPlayer();
        }else if(MP4.equalsIgnoreCase(audioType)){
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(VLC.equalsIgnoreCase(audioType)){
            advanceMediaPlayer.playVlc(filename);
        }else if(MP4.equalsIgnoreCase(audioType)){
            advanceMediaPlayer.playMp4(filename);
        }
    }
}
