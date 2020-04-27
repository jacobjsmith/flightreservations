package com.flightreservations.service.interfaces;


import java.util.List;
import java.util.Map;

public interface FlightService {

    /**
     * @return
     */
    List<Map<String, Object>> getAllFlightInfo() throws Exception;
}
