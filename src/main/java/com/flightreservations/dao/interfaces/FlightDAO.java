package com.flightreservations.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface FlightDAO {

    List<Map<String, Object>> getAllFlightInfo() throws Exception;
}
