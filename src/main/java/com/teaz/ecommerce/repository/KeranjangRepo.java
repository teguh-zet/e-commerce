package com.teaz.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teaz.ecommerce.entity.Keranjang;

public interface KeranjangRepo extends JpaRepository<Keranjang,String>{
    
}
