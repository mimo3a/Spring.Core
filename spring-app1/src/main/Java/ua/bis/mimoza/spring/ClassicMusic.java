package ua.bis.mimoza.spring;

import org.springframework.stereotype.Component;


public class ClassicMusic implements Music {
	
	             

	@Override
	public String getSong() {

		return "Classical Song";
	}

}
