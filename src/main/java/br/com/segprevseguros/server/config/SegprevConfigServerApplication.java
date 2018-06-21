package br.com.segprevseguros.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SegprevConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SegprevConfigServerApplication.class, args);
    }
}
