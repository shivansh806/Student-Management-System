package com.rest.RestApi.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ActualStudentData {
    private String name;
    private String email;
}
