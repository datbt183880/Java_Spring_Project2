package com.example.restController_pathVariable_requestBody;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Todo {
    private String title;
    private String detail;
}
