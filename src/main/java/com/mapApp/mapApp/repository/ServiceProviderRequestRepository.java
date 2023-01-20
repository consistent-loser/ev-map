package com.mapApp.mapApp.repository;

import com.mapApp.mapApp.entity.ServiceProviderDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProviderRequestRepository extends MongoRepository<ServiceProviderDetails,String> {
}
