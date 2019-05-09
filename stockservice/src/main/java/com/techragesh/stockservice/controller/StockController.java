package com.techragesh.stockservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @GetMapping("/stock")
    public String account() {
        return " This is stock service";
    }
}