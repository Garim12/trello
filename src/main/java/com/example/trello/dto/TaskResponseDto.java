package com.example.trello.dto;

import com.example.trello.entity.Task;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TaskResponseDto {
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public TaskResponseDto(Task task) {
        this.title = task.getTitle();
        this.startDate = task.getStartDate();
        this.endDate = task.getEndDate();
    }
}
