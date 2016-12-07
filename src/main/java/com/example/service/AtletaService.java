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

    public void crearAtletas(){
        Atleta atleta1 = new Atleta("Ivan","Puchades","Española", LocalDate.of(1995,10,11));
        atletaRepository.save(atleta1);
        Atleta atleta2 = new Atleta("ChaoJun", "Chao", "China", LocalDate.of(1997,3,17));
        atletaRepository.save(atleta2);
        Atleta atleta3 = new Atleta("Raul", "Vazquez", "Italiano", LocalDate.of(1996, 12, 1));
        atletaRepository.save(atleta3);

    }
    public void testAtletas(){
        System.out.println(atletaRepository.findByNacionalidad("Rusa"));
        System.out.println(atletaRepository.findByFechaNacimientoDespues(LocalDate.of(1996, 12, 1)));
    }

}
