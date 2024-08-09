package com.retailers.test.service.impl;

import com.retailers.test.dao.RetailerDAO;
import com.retailers.test.dto.RetailerDTO;
import com.retailers.test.entity.Retailer;
import com.retailers.test.service.RetailerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class RetailerServiceImpl implements RetailerService {

    @Autowired
    private RetailerDAO retailerDAO;

    @Override
    public List<RetailerDTO> getAllRetailers(){
        List<Retailer> retailers = retailerDAO.getAll();
        return retailers.stream().map(retailer -> {
            RetailerDTO retailerDTO = new RetailerDTO();
            retailerDTO.setId(retailer.getId());
            retailerDTO.setNic_no(retailer.getNic_no());
            retailerDTO.setFirst_name(retailer.getFirst_name());
            retailerDTO.setSecond_name(retailer.getSecond_name());
            retailerDTO.setAddress(retailer.getAddress());
            return retailerDTO;
        }).collect(Collectors.toList());
    }
}
