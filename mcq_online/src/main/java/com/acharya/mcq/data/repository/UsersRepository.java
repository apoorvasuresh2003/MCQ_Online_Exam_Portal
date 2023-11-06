package com.acharya.mcq.data.repository;

import org.springframework.stereotype.Repository;

import com.acharya.mcq.data.model.Users;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UsersRepository extends CrudRepository<Users, String> {

}
