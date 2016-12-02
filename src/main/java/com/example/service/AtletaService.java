package com.example.service;

import com.example.domain.Atleta;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by dam on 1/12/16.
 */
@Service
public class AtletaService {
    @Autowired
    private AtletaRepository atletaRepository;

    @Autowired
    private MedallaRepository medallaRepository;

    public void testAtletas(){
        Atleta atleta1 = new Atleta("Ivan","Puchades","Española", LocalDate.of(1995,10,11));
        atletaRepository.save(atleta1);
        Atleta atleta2 = new Atleta("ChaoJun", "Chao", "China", LocalDate.of(1997,4,10));
        atletaRepository.save(atleta2);
        Atleta atleta3 = new Atleta(3, "Raul", "Vazquez", "Italiano", LocalDate.of(1996, 12, 1));
        atletaRepository.save(atleta3);

    }


}
