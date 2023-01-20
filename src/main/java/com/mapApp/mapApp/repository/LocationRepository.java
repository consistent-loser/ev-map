package com.mapApp.mapApp.repository;

import com.mapApp.mapApp.entity.GeoLocation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends MongoRepository<GeoLocation,String> {
}
