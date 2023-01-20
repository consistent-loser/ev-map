package com.mapApp.mapApp.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.Date;
@Data
@Component
@Document(
        collection = "serviceProviderDetails"
)
public class ServiceProviderDetails {
    String name;
    String companyName;
    String stationCount;
    String email;
    String phone;
    Date reqDate;
}
