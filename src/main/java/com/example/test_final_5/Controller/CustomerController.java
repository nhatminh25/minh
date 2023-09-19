package com.example.test_final_5.Controller;

import com.example.test_final_5.Entity.CustomerRequest;
import com.example.test_final_5.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/customer")

public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @GetMapping("/get")
    public ResponseEntity<?> getCustomer(){
        return new ResponseEntity<>(customerService.getListItems(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<?> addCustomer(@RequestBody CustomerRequest customerRequest){
        return new ResponseEntity<>(customerService.postListItems(customerRequest), HttpStatus.OK);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<?> updCustomer(@PathVariable Long id, @RequestBody CustomerRequest customerRequest){
        return new ResponseEntity<>(customerService.putListItems(id, customerRequest), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerService.delListItems(id), HttpStatus.OK);
    }
}
