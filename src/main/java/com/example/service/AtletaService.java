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
        Atleta atleta1 = new Atleta(1,"Ivan","Puchades","Española", LocalDate.of(1995,10,11), "Oro");
        atletaRepository.save(atleta1);
        Atleta atleta2 = new Atleta(2, "ChaoJun", "Chao", "China", LocalDate.of(1997,4,10), "Bronce");
        atletaRepository.save(atleta2);
        Atleta atleta3 = new Atleta(3, "Raul", "Vazquez", "Italiano", LocalDate.of(1996, 12, 1));
        atletaRepository.save(atleta3);

    }


}
