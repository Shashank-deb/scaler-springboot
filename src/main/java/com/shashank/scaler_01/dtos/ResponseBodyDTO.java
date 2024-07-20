package com.shashank.scaler_01.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class ResponseBodyDTO {

    private String name;
    private Date dueDate;
    private Boolean completed;
}
