package poo.interfaces.Musicplayer;

public class Main {
    static void main(String[] args) {
        runMusic(new Smartphone());
        runVideo(new Smartphone());
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}