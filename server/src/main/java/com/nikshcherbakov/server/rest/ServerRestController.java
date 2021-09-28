package com.nikshcherbakov.server.rest;

import com.nikshcherbakov.MyApi;
import com.nikshcherbakov.dto.ObjectDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ServerRestController implements MyApi {

    @Override
    public ObjectDto getObject() {
        return new ObjectDto("Example name", "Example value");
    }
}
