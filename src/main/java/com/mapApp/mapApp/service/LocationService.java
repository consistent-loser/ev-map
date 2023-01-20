package com.mapApp.mapApp.service;

import com.mapApp.mapApp.entity.GeoLocation;
import com.mapApp.mapApp.entity.ServiceProviderDetails;
import com.mapApp.mapApp.repository.LocationRepository;
import com.mapApp.mapApp.repository.ServiceProviderRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LocationService {
    @Autowired
    public GeoLocation geoData;


    @Autowired
    public LocationRepository locationRepository;
    @Autowired
    public ServiceProviderRequestRepository serviceProviderRequestRepository;

    public GeoLocation saveGeoData(GeoLocation data){
        geoData.setLatitude(data.getLatitude());
        geoData.setLongitude(data.getLongitude());
        geoData.setName(data.getName());
        geoData.setVerified(false);
        geoData.setBikeCharge(data.isBikeCharge());
        geoData.setCarCharge(data.isCarCharge());
        locationRepository.save(geoData);
        return geoData;
    }

    public List<GeoLocation> getGeoLocation(){
        List<GeoLocation> locationList = locationRepository.findAll();
        return locationList;
    }

    public ServiceProviderDetails saveServiceProviderDetails(ServiceProviderDetails details){
        System.out.println();
        details.setReqDate(new Date());
        serviceProviderRequestRepository.save(details);
        return details;
    }
}
