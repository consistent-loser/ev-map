package com.mapApp.mapApp.controller;

import com.mapApp.mapApp.entity.GeoLocation;
import com.mapApp.mapApp.entity.ServiceProviderDetails;
import com.mapApp.mapApp.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/registerStations")
public class LocationController {
    @Autowired
    public LocationService locationService;

    @GetMapping("/health-check")
    public String healthCheck(){
        return "Health check success!";
    }

    @PostMapping("/saveGeoData")
    public ResponseEntity<GeoLocation> saveGeoData(@RequestBody GeoLocation requestBody){
        GeoLocation geoData = locationService.saveGeoData(requestBody);
        return ResponseEntity.ok(geoData);
    }

    @GetMapping("/getGeoData")
    public List<GeoLocation> getGeoLocation(){
        return locationService.getGeoLocation();
    }

    @PostMapping("/bulkDataRequest")
    public ResponseEntity<ServiceProviderDetails> saveContactDetails(@RequestBody ServiceProviderDetails details){
        ServiceProviderDetails savedDetails = locationService.saveServiceProviderDetails(details);
        return ResponseEntity.ok(savedDetails);
    }
}
