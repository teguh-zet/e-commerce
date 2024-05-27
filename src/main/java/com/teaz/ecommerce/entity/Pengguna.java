package com.teaz.ecommerce.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pengguna implements Serializable {
    @Id
    private String id;
    private String password;
    private String nama;
    private String alamat;
    private String email;
    private String hp;
    private String roles;
    private boolean isAktif;
}
