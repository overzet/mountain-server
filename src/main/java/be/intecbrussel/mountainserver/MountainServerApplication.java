package be.intecbrussel.mountainserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "be.intecbrussel.mountainserver")
public class MountainServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MountainServerApplication.class, args);
    }

}

