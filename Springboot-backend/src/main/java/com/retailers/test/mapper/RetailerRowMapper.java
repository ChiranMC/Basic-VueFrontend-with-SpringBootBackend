package com.retailers.test.mapper;

import com.retailers.test.entity.Retailer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetailerRowMapper implements RowMapper<Retailer> {
    @Override
    public Retailer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Retailer retailer = new Retailer();
        retailer.setId(rs.getInt("id"));
        retailer.setNic_no(rs.getString("Nic_no"));
        retailer.setFirst_name(rs.getString("first_name"));
        retailer.setSecond_name(rs.getString("last_name"));
        retailer.setAddress(rs.getString("address"));

        return retailer;
    }

    public static class DynamicColumnRowMapper implements RowMapper<Map<String, Object>>{
        private List<String> colummNames;

        public DynamicColumnRowMapper(List<String> columnNames){
            this.colummNames = columnNames;
        }

        @Override
        public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
            Map<String, Object> results = new HashMap<>();
            for (String columnName : colummNames){
                results.put(columnName, rs.getObject(columnName));
            }

            return results;
        }
    }
}
