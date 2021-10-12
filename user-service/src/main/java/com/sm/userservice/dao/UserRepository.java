package com.sm.userservice.dao;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.sm.userservice.model.LibUser;

import reactor.core.publisher.Flux;

@Repository
public interface UserRepository extends ReactiveCosmosRepository<LibUser, Integer>{
	Flux<LibUser> findByFname(String name);
}
