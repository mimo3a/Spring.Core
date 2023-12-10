package ua.bis.mimoza.spring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicPlayer {

	private List <Music> musicList = new ArrayList<>();
	String name;
	int volume;
	
	public void playMusic() {
		Iterator <Music> iter = musicList.iterator();
		while (iter.hasNext()) {
			Music song = iter.next();
			System.out.println("Playing : " + song.getSong());
		}	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public List<Music> getMusicList() {
		return musicList;
	}
	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}
	public void myInit() {
		System.out.println("Music Player is init");
	}
	public void myDestroy() {
		System.out.println("Music Player is destroy");
	}
	
}
