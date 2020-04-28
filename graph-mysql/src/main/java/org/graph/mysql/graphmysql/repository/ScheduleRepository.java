package org.graph.mysql.graphmysql.repository;

import org.graph.mysql.graphmysql.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
