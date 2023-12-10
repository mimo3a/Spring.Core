package ua.bis.mimoza.spring;

public class ClassicMusic implements Music{
	
	private ClassicMusic() {};
	
	public static ClassicMusic getClassicMusic() {
		return new ClassicMusic();
	}
	
	String song;
	private void doMyInit() {
		System.out.println("Doing initialisation");
	}
	
	private void doMyDestroy() {
		System.out.println("Doing my destruction");
	}
	
	
	@Override
	public String getSong() {
		
		return song;
	}

	@Override
	public void setSong(String song) {
		this.song = song;
		
	}

}
