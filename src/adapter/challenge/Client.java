package adapter.challenge;

public class Client {

	public static void main(String[] args) {
		MediaPlayer media = new AudioPlayer();
		AdvancedMediaPlayer mp4 = new Mp4Player();
		AdvancedMediaPlayer vlc = new VlcPlayer();
		AdvancedMediaPlayerAdapter mp4Adapter = new AdvancedMediaPlayerAdapter(mp4);
		AdvancedMediaPlayerAdapter vlcAdapter = new AdvancedMediaPlayerAdapter(vlc);
		
		media.play("mp3", "In the end");
		media.play("avi", "Mission Impossible");
		
		mp4Adapter.play("mp4", "Java Tutorial");
		vlcAdapter.play("vlc", "Iron Man 2");
	}

}
