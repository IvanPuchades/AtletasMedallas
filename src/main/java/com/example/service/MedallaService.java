package com.example.service;

import com.example.domain.Atleta;
import com.example.domain.Medalla;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by dam on 1/12/16.
 */

@Service
public class MedallaService {

    @Autowired
    private MedallaRepository

   // @Autowired
   // private AtletaRepository

    public void testMedallas(){
        Medalla medalla1 = new Medalla(1,"Tiro al Arco","alebin");
        MedallaRepository.save(medalla1);


    }
}
