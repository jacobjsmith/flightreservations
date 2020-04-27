package com.flightreservations.dao.impl;

import com.flightreservations.dao.interfaces.FlightDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class FlightDAOImpl implements FlightDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Map<String, Object>> getAllFlightInfo() throws Exception {
        return jdbcTemplate.queryForList("SELECT FLIGHTID, FLIGHTNAME FROM FLIGHT");
    }
}
