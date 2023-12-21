package ua.bis.mimoza.spring;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music {

   

    

    @Override
    public String getSong() {
        return "Rock Song";
    }
}