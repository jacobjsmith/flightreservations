package com.flightreservations.service.impl;

import com.flightreservations.dao.interfaces.FlightDAO;
import com.flightreservations.service.interfaces.FlightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightDAO dao;

    @Override
    public List<Map<String, Object>> getAllFlightInfo() throws Exception {
        return dao.getAllFlightInfo();
    }
}
