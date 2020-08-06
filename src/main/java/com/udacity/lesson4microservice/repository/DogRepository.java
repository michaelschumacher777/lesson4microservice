package com.udacity.lesson4microservice.repository;

import com.udacity.lesson4microservice.enitity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
