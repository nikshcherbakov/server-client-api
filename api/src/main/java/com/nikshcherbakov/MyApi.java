package com.nikshcherbakov;

import com.nikshcherbakov.dto.ObjectDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface MyApi {

    @GetMapping("/object")
    ObjectDto getObject();

}
