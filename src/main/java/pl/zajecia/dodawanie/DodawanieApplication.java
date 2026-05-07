package pl.zajecia.dodawanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DodawanieApplication {

    public static void main(String[] args) {
        SpringApplication.run(DodawanieApplication.class, args);
    }

    public int add(int a, int b) {
        return a * b;
    }

    @GetMapping("/")
    public String get() {
        return "Hello Jenkins";
    }
}