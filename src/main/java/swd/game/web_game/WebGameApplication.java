package swd.game.web_game;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;

@SpringBootApplication

public class WebGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebGameApplication.class, args);
        System.out.println("my push notitifaction");
    }

}
