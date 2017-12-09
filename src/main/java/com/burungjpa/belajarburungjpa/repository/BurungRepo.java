package com.burungjpa.belajarburungjpa.repository;

import com.burungjpa.belajarburungjpa.entity.Burung;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BurungRepo extends CrudRepository<Burung, Long>{

    List<Burung> findByNamaburung(String namaburung);

}