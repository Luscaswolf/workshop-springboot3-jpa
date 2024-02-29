package com.mindi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindi.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
