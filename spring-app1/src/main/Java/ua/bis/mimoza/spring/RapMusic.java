package ua.bis.mimoza.spring;

public class RapMusic implements Music {

	String song;

	@Override
	public String getSong() {

		return song;
	}

	@Override
	public void setSong(String song) {
		this.song = song;
	}

}
