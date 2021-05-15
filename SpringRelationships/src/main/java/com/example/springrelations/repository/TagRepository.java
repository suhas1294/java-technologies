package com.example.springrelations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springrelations.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
