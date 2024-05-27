package com.teaz.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teaz.e_commerce.entity.Kategori;

public interface KategoriRepo extends JpaRepository<Kategori,String> {
    
}
