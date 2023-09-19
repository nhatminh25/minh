package com.example.test_final_5.Mapping;

import com.example.test_final_5.Entity.CustomerEntity;
import com.example.test_final_5.Entity.CustomerRequest;
import com.example.test_final_5.Entity.CustomerResponse;
import lombok.Data;

@Data

public class CustomerMapping {
    public static CustomerEntity MapRequestToEntity(CustomerRequest customerRequest){
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName(customerRequest.getName());
        customerEntity.setAddress(customerRequest.getAddress());
        customerEntity.setMobile(customerRequest.getMobile());
        return customerEntity;
    }

    public static CustomerResponse MapEntityToResponse(CustomerEntity customerEntity){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setId(customerEntity.getId());
        customerResponse.setName(customerEntity.getName());
        customerResponse.setAddress(customerEntity.getAddress());
        customerResponse.setMobile(customerEntity.getMobile());
        return customerResponse;
    }
}
