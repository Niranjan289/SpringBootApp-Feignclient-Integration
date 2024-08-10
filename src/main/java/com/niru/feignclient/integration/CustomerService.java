package com.niru.feignclient.integration;

import com.niru.dto.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8081/api", value = "CUSTOMER-SERVICE")
public interface CustomerService {

    @GetMapping("/customer")
    Customer getCustomer();
}
