package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.book;

public interface bookRepository extends JpaRepository<book, Long> {

}
