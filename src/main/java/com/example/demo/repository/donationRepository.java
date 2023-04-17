package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.donations;

public interface donationRepository extends JpaRepository<donations, Long> {

}
