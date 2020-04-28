package org.graph.mysql.graphmysql.controller;

import org.graph.mysql.graphmysql.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("schedule")
public class RestSchedule {

    @Autowired private ScheduleRepository scheduleRepository;

    @GetMapping("all")
    public List getSchdule(){
        return scheduleRepository.findAll();
    }

}
