package icu.bibilailai.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MyBean /*implements CommandLineRunner*/ {
    @Autowired
    public MyBean(ApplicationArguments args){
        boolean debug = args.containsOption("debug");
        List<String> nonOptionArgs = args.getNonOptionArgs();
        // 如果运行时加上 --debug logfile.txt  参数，，debug=true, nonOptionArgs=[logfile.txt]


//        Spring Boot还注册CommandLinePropertySource和Spring Environment。这使您还可以使用@Value注释注入单个应用程序参数。

        Environment environment ;

        CommandLinePropertySource commandLinePropertySource;



        //		如果您需要在SpringApplication启动后运行某些特定代码，则可以实现ApplicationRunner或CommandLineRunner接口。两个接口以相同的方式工作，并提供单个run方法，该方法在SpringApplication.run(…​)完成之前调用。

    }


//    @Override
//    public void run(String args) throws Exception {
//        // Do something
//        Arrays.stream(args).peek(t-> System.out.println(t)).collect(Collectors.toList());
//    }
}
