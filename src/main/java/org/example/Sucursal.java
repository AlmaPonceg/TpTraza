package org.example;

import java.time.LocalTime;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Boolean es_Casa_Matriz;
    private Domicilio domicilio;

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Boolean es_Casa_Matriz, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.es_Casa_Matriz = es_Casa_Matriz;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Boolean getEs_Casa_Matriz() {
        return es_Casa_Matriz;
    }

    public void setEs_Casa_Matriz(Boolean es_Casa_Matriz) {
        this.es_Casa_Matriz = es_Casa_Matriz;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
