package ua.bis.mimoza.spring;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

	@Override
	public String getSong() {

		return "Rap Song";
	}

}
