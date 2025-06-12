package com.example.proyecto1.Repository;

import com.example.proyecto1.Entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void saveCustomer(){
        Customer customer = Customer.builder()
                .firstName("Juanin")
                .lastName("Paz")
                .email("Juana@gmail.com").build();
        customerRepository.save(customer);
    }

}