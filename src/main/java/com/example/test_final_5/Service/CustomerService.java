package com.example.test_final_5.Service;

import com.example.test_final_5.Entity.CustomerRequest;
import com.example.test_final_5.Entity.ResponseApi;
import org.springframework.stereotype.Service;

@Service

public interface CustomerService {
    ResponseApi getListItems();
    ResponseApi postListItems(CustomerRequest customerRequest);
    ResponseApi putListItems(Long id, CustomerRequest customerRequest);
    ResponseApi delListItems(Long id);
}
