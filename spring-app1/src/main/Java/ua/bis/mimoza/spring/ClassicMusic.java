package ua.bis.mimoza.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {

	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Classical Song";
	}

	
}
