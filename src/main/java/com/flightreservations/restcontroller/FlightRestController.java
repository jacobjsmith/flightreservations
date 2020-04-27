package com.flightreservations.restcontroller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class FlightRestController {

    private final Gson gson = new Gson();

    @RequestMapping(value = "/flight-data", method = RequestMethod.GET)
    public String getAllFlightInfo() {
        List<Map<String, Object>> result = null;
        try {
//            result = flightService.getAllFlightInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gson.toJson(result);
    }
}
