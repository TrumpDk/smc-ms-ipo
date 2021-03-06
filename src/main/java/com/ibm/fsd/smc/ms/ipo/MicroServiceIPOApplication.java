package com.ibm.fsd.smc.ms.ipo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroServiceIPOApplication {

    private static Logger log = LoggerFactory.getLogger(MicroServiceIPOApplication.class);

    public static void main(String[] args) {
        log.debug("--- begin....");
        SpringApplication.run(MicroServiceIPOApplication.class, args);
        log.debug("--- has been startup...");
    }

}
