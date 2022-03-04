package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
	
    public Optional<UserInfo> findById(Long id);
    

}