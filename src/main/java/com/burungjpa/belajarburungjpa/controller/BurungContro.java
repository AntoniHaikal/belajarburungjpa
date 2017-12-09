package com.burungjpa.belajarburungjpa.controller;

import com.burungjpa.belajarburungjpa.entity.Burung;
import com.burungjpa.belajarburungjpa.repository.BurungRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/burung/")
public class BurungContro {

    @Autowired
    private BurungRepo burungRepo;

    @GetMapping("")
    public Iterable<Burung> getAll(){
        return burungRepo.findAll();
    }

    @PostMapping("")
    public Burung saveBurung(@RequestBody Burung burung){
        return burungRepo.save(burung);
    }


    @GetMapping("{id}")
    public Burung findById(@PathVariable(value = "id") String id){
        return burungRepo.findOne(Long.parseLong(id));
    }

    @DeleteMapping("{id}/deleteBurung")
    public void deleteBurung(@PathVariable(value = "id") String id){
        burungRepo.delete(Long.parseLong(id));
    }
    @GetMapping("nama")
    public Iterable<Burung> getByName(@RequestParam(value = "namaburung") String namaburung){
        return burungRepo.findByNamaburung(namaburung);
    }

}
