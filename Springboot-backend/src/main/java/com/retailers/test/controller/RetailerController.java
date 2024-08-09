package com.retailers.test.controller;

import com.retailers.test.apiresponses.ApiResponse;
import com.retailers.test.dto.RetailerDTO;
import com.retailers.test.service.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RetailerController {
    @Autowired
    private RetailerService retailerService;

    @GetMapping(path = "/retailers")
    public ApiResponse<List<RetailerDTO>> getAllRetailers(){
        try{
            List<RetailerDTO> retailers = retailerService.getAllRetailers();
            return new ApiResponse<>(true, HttpStatus.OK.value(), "Successfully retrieved data", retailers);
        }catch (Exception e){
            return new ApiResponse<>(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), "failed to retrieve data", null);
        }
    }
}
