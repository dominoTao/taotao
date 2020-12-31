package icu.bibilailai.core.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    @Bean
    @Autowired(required = false)
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
