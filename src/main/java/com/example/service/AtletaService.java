package com.example.service;

import com.example.domain.Atleta;
import com.example.repository.AtletaRepository;
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

    public void testAtletas(){
        Atleta atleta1 = new Atleta(1,"Ivan","Puchades","Española", LocalDate.of(1995,29,11));
        AtletaRepository.save(atleta1);
    }


}
