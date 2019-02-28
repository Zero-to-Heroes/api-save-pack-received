package com.zerotoheroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackStatService {

    private PackStatRepository repository;

    @Autowired
    public PackStatService(PackStatRepository repository) {
        this.repository = repository;
    }

    public void createPackStat(PackStat packStat) {
        repository.savePackStat(packStat);
    }
}
