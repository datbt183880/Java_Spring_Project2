package com.example.restController_pathVariable_requestBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Todo {
    private String title;
    private String detail;
}
