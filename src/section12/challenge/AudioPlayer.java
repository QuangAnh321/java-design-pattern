package section12.challenge;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing "+audioType+" file. Name: "+fileName+"."+audioType);
		} else {
			System.out.println("Invalid media. Type "+audioType+" is not supported");
		}
	}

}
