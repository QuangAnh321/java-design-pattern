package section12.challenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
	
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	@Override
	public void play(String mediaType, String fileName) {
		advancedMediaPlayer.loadFileName(fileName);
		advancedMediaPlayer.listen();
		
//		if (mediaType.equalsIgnoreCase("mp4") && this.advancedMediaPlayer instanceof Mp4Player 
//				|| mediaType.equalsIgnoreCase("vlc") && this.advancedMediaPlayer instanceof VlcPlayer) {
//			advancedMediaPlayer.listen();
//		} else {
//			System.out.println("Invalid media. Type: "+mediaType+" is not supported");
//		}
	}

}
