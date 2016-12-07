package com.example.service;

import com.example.domain.Medalla;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dam on 1/12/16.
 */

@Service
public class MedallaService {

    @Autowired
    private MedallaRepository medallaRepository;

    @Autowired
    private AtletaRepository atletaRepository;

   // @Autowired
   // private AtletaRepository

    public void testMedallas(){
        Medalla medalla1 = new Medalla(1,"Tiro al Arco","alebin");
        medallaRepository.save(medalla1);


    }
}
