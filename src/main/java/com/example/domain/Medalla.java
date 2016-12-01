package com.example.domain;

import javax.persistence.*;

/**
 * Created by dam on 1/12/16.
 */


@Entity
public class Medalla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int enumeracion;
    private String especialidad;
    private String competicion;
    @ManyToOne
    private Atleta atleta;

    //Constructor
    public Medalla(int enumeracion, String especialidad, String competicion, Atleta atleta) {
        this.enumeracion = enumeracion;
        this.especialidad = especialidad;
        this.competicion = competicion;
        this.atleta = atleta;
    }

    public Medalla() {
    }

    //Getters

    public long getId() {
        return id;
    }

    public int getEnumeracion() {
        return enumeracion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    //Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setEnumeracion(int enumeracion) {
        this.enumeracion = enumeracion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    @Override
    public String toString() {
        return "Medalla{" +
                "id=" + id +
                ", enumeracion=" + enumeracion +
                ", especialidad='" + especialidad + '\'' +
                ", competicion='" + competicion + '\'' +
                ", atleta=" + atleta +
                '}';
    }
}
