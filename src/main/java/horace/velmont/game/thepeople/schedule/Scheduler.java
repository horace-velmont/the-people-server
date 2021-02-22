package horace.velmont.game.thepeople.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Scheduler {

  @Scheduled(cron = "*/30 * * * * *")
  public void task() {
    log.info("The game begins");
  }
}
