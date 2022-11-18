package com.schl.repository.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schl.entity.school.School;


@Repository
public interface SchoolRepositary extends JpaRepository<School, Integer> {

}
