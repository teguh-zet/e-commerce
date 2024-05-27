package com.teaz.e_commerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teaz.e_commerce.entity.Produk;
import com.teaz.e_commerce.exception.ResourceNotFoundException;
import com.teaz.e_commerce.repository.ProdukRepo;

@Service
public class ProdukService {
    @Autowired 
    private ProdukRepo produkRepo;

    // public List<Produk> findRange(String filterText, int page, int limit){

    // }
    public List<Produk> findAll(){
        return produkRepo.findAll();
    }
    public Produk findById(String id ){
        return produkRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("produk dengan id "+id+" tidak ditemukan"));
    }
    public Produk create(Produk produk){
        return produkRepo.save(produk);
    }
    public Produk edit(Produk produk){
        return produkRepo.save(produk);
    }
    public Produk ubahGambar(String id, String gambar){
        Produk produk =findById(id);
        produk.setGambar(gambar);
        return produkRepo.save(produk);
    }
    public void deleteById(String id){
        produkRepo.deleteById(id);
    }
}
