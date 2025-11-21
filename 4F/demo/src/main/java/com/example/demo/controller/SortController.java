package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustonREquest;
import com.example.demo.service.SortService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/sort")
public class SortController {

    @Autowired
    SortService service;

    @PostMapping("/insertion")
    public int[] postMethodName(@RequestBody CustonREquest entity) {
        String requestData=entity.getData();
        String[] stringData = requestData.split(",");
        int[] arrNUm=new int[stringData.length];
        for (int i = 0; i < stringData.length; i++) {
            arrNUm[i]=Integer.parseInt(stringData[i]);
        }
        return service.sort(arrNUm);
    }
    

}
