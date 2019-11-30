package org.experiments.hateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HateOASRESTService {

    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(HateOASRESTService.class, args);
    }

}
