package com.example.test_final_5.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerResponse {
    private Long id;
    private String name;
    private String address;
    private String mobile;
}
