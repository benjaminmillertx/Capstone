package com.example.millertalentagency.repository;

import com.example.millertalentagency.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {}
