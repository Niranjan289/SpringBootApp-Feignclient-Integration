package com.niru.feignclient.integration;

import com.niru.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com/", value = "User-Client")
public interface UserDetailsService {

    @GetMapping("/users")
    List<UserResponse> getAllUsers();
}
