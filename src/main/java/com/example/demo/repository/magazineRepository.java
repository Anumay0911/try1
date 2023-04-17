package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.magazine;

public interface magazineRepository extends JpaRepository<magazine, Long> {

}
