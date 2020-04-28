package org.graph.mysql.graphmysql;

import org.graph.mysql.graphmysql.entities.Schedule;
import org.graph.mysql.graphmysql.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class GraphMysqlApplication {

    @Autowired
    private static ScheduleRepository scheduleRepository;
    public static void main(String[] args) {
        SpringApplication.run(GraphMysqlApplication.class, args);
        scheduleRepository.save(new Schedule(1L,"country", "* * * * *", LocalDateTime.now(), LocalDateTime.now()));

    }

}
