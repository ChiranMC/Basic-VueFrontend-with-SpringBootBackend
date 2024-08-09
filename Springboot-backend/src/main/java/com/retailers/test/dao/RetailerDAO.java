package com.retailers.test.dao;

import com.retailers.test.entity.Retailer;
import com.retailers.test.mapper.RetailerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RetailerDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Retailer> getAll(){
        String sql = "SELECT * FROM retailers";
        return jdbcTemplate.query(sql, new RetailerRowMapper());
    }
}
