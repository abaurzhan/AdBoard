package com.adboard.repository;

import com.adboard.domain.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Integer> {
}
