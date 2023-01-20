package com.mapApp.mapApp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Data
@Component
@Document(
        collection = "geoLocation"
)
public class GeoLocation {

        private double latitude;
        private double longitude;
        private String name;
        private boolean verified;
        private boolean bikeCharge;
        private boolean carCharge;
}
