package com.teaz.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teaz.e_commerce.entity.Produk;

public interface ProdukRepo extends JpaRepository<Produk,String>{
    
}
