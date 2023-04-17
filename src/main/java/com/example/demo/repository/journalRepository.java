package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.journal;

public interface journalRepository extends JpaRepository<journal, Long> {

}
