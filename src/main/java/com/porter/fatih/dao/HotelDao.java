package com.porter.fatih.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by serpilkuzu on 27/04/2020.
 */
@Repository
public class HotelDao {

    final JdbcTemplate jdbcTemplate;


    @Autowired
    public HotelDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean insertHotelCode(String userId, String hotelCode) {

        String sql = "INSERT INTO booking_second values (?, ?)";

        int update = jdbcTemplate.update(sql, userId, hotelCode);

        return update > 0;
    }

}
