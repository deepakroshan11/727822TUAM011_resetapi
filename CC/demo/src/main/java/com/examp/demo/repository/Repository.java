package com.examp.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examp.demo.model.Model;



public interface Repository extends JpaRepository<Model,Integer>
{
    Optional<Model> findById(int id);
}