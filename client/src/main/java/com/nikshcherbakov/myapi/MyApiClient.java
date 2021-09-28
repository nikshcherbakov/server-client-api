package com.nikshcherbakov.myapi;

import com.nikshcherbakov.MyApi;
import com.nikshcherbakov.dto.ObjectDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MyApiClient", url = "http://localhost:8080")
public interface MyApiClient extends MyApi {

    @GetMapping(value = "/object")
    ObjectDto getObject();
}
