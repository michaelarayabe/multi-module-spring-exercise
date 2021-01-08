package gure.springframework.json.springbootmmjson.controller;

import gure.springframework.json.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress(){

        return new ShippingAddress();
    }
}
