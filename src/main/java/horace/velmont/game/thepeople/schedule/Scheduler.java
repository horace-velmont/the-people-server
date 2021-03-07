package horace.velmont.game.thepeople.schedule;

import horace.velmont.game.thepeople.dao.PersonDao;
import horace.velmont.game.thepeople.model.Person;
import horace.velmont.game.thepeople.util.RandomKoreanNameGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Scheduler {

  private final PersonDao personDao;

  @Scheduled(cron = "*/30 * * * * *")
  public void task() {
    Person person = personDao
        .save(Person.builder().name(RandomKoreanNameGenerator.randomHangulName()).build());
    log.info("The person birth: " + person.getName());
  }
}
