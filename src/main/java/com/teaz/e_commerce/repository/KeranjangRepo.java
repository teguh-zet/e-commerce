package com.teaz.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teaz.e_commerce.entity.Keranjang;

public interface KeranjangRepo extends JpaRepository<Keranjang,String>{
    
}
