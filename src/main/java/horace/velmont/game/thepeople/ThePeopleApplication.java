package horace.velmont.game.thepeople;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ThePeopleApplication {

  public static void main(String[] args) {
    SpringApplication.run(ThePeopleApplication.class, args);
  }
}
