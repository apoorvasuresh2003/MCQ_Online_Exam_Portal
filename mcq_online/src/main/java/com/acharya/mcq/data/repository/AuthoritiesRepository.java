package com.acharya.mcq.data.repository;

import org.springframework.stereotype.Repository;

import com.acharya.mcq.data.model.Authorities;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AuthoritiesRepository extends CrudRepository<Authorities, String> {

}