package icu.bibilailai.core.service;

import icu.bibilailai.core.config.AcmeProperties;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyService {
    private final AcmeProperties properties ;
    @Autowired
    public MyService(AcmeProperties properties) {
        this.properties = properties;
    }

    @PostConstruct
    public void openConnection() {
//        Server server = new Server(this.properties.getRemoteAddress());
        // ...
    }
}
