package com.teaz.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teaz.e_commerce.entity.Pengguna;

public interface PenggunaRepo extends JpaRepository<Pengguna,String>{
    
}
