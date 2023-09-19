package com.example.test_final_5.Service;

import com.example.test_final_5.Entity.CustomerEntity;
import com.example.test_final_5.Entity.CustomerRequest;
import com.example.test_final_5.Entity.CustomerResponse;
import com.example.test_final_5.Entity.ResponseApi;
import com.example.test_final_5.Mapping.CustomerMapping;
import com.example.test_final_5.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component

public class ImplementService implements CustomerService {
    @Autowired
    public CustomerRepository customerRepository;

    @Override
    public ResponseApi getListItems() {
        try{
            List<CustomerEntity> customerEntityList = customerRepository.findAll();
            List<CustomerResponse> customerResponseList = customerEntityList.stream().map(CustomerMapping::MapEntityToResponse).collect(Collectors.toList());
            return new ResponseApi(true, "Success", customerResponseList);
        }catch (Exception e){
            return new ResponseApi(false, e.getMessage(), null);
        }
    }

    @Override
    public ResponseApi postListItems(CustomerRequest customerRequest) {
        try{
            CustomerEntity customerEntity = CustomerMapping.MapRequestToEntity(customerRequest);
            customerRepository.save(customerEntity);
            return new ResponseApi(true, "Success", null);
        }catch (Exception e){
            return new ResponseApi(false, e.getMessage(), null);
        }
    }

    @Override
    public ResponseApi putListItems(Long id, CustomerRequest customerRequest) {
        try{
//            CustomerEntity customerEntity = CustomerMapping.MapRequestToEntity(customerRequest);
//            customerEntity.setId(id);
//            customerRepository.save(customerEntity);

            CustomerEntity customerEntity = customerRepository.findById(id).get();
            System.out.println(customerEntity + " mingminfsad");
            CustomerMapping.MapRequestToEntity(customerRequest);
            CustomerMapping.MapEntityToResponse(customerEntity);



//            customerEntity.setName(customerRequest.getName());
//            customerEntity.setAddress(customerRequest.getAddress());
//            customerEntity.setMobile(customerRequest.getMobile());
            customerRepository.save(customerEntity);

//            CustomerEntity customerEntity = customerRepository.findById(id).get();
//            List<CustomerEntity> customerEntityList = customerRepository.findAll();
//            List<CustomerResponse> customerResponseList = customerEntity.stream().map(CustomerMapping::MapEntityToResponse).collect(Collectors.toList());

//            List<CustomerEntity> customerEntityList = customerRepository.findById(id).stream().toList();
//            List<CustomerEntity> data = customerEntityList.stream().map(user -> mapper.map(user, CustomerEntity.class)).collect(Collectors.toList());

            //sua du lieu
            //tim id da chon
            //set lai thong tinD
            //luu vao db
            //

            return new ResponseApi(true, "Success", null);
        }catch (Exception e){
            return new ResponseApi(false, e.getMessage(), null);
        }
    }

    @Override
    public ResponseApi delListItems(Long id) {
        try{
            customerRepository.deleteById(id);
            return new ResponseApi(true, "Success", null);
        }catch (Exception e){
            return new ResponseApi(false, e.getMessage(), null);
        }
    }
}
