package com.shashank.scaler_01.task;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Task {
    Integer id;
    String name;
    Date dueDate;
    Boolean completed;
}
