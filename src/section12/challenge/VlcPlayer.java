package section12.challenge;

public class VlcPlayer implements AdvancedMediaPlayer {
	
	private String fileName;

	@Override
	public void loadFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void listen() {
		System.out.println("Playing vlc file. Name: "+fileName+".vlc");
	}

}
