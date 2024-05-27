package com.teaz.e_commerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teaz.e_commerce.entity.Kategori;
import com.teaz.e_commerce.exception.ResourceNotFoundException;
import com.teaz.e_commerce.repository.KategoriRepo;

@Service
public class KategoriService {
    @Autowired
    private KategoriRepo kategoriRepo;

    public Kategori findById(String id){
        return kategoriRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("kategori dengan id "+ id +"tidak ditemukan"));
    }
    public List<Kategori> findAll(){
        return kategoriRepo.findAll();
    }
    public Kategori create(Kategori kategori){
        return kategoriRepo.save(kategori);

    }
    public Kategori edit(Kategori kategori){
        return kategoriRepo.save(kategori);
    }
    public void deleteById(String id){
        kategoriRepo.deleteById(id);
    }
    
}
