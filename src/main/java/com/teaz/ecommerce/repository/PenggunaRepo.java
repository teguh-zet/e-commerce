package com.teaz.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teaz.ecommerce.entity.Pengguna;

public interface PenggunaRepo extends JpaRepository<Pengguna,String>{
    Boolean existsByEmail(String email);
}
