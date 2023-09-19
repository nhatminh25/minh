package com.example.test_final_5.Repository;

import com.example.test_final_5.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
