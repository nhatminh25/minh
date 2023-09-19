package com.example.test_final_5.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseApi {
    private boolean status;
    private String message;
    private List content;
}
