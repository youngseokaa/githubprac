package com.example.demo.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CocoController {
    public static void main(String[] args) {
        System.out.println();
    }
    private final CocoService cocoService;
    @Autowired
    public CocoController(CocoService cocoService){
        this.cocoService = cocoService;

    }
}
