package xyz.dimitr.mstodo.model;

import java.util.Date;

import lombok.Data;

@Data
public class TodoDto {

    private Long userId;

    private String name;

    private String description;

    private Date reminderDate;

    private String status;
    
}
