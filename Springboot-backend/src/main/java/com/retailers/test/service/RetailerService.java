package com.retailers.test.service;

import com.retailers.test.dto.RetailerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RetailerService {
    List<RetailerDTO> getAllRetailers();
}
