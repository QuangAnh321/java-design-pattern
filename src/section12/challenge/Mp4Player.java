package section12.challenge;

public class Mp4Player implements AdvancedMediaPlayer {
	
	private String fileName;

	@Override
	public void loadFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void listen() {
		System.out.println("Playing mp4 file. Name: "+fileName+".mp4");
	}

}
