package org.example;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private Integer cuit;
    private String logo;
    private Set<Sucursal> sucursales;

    public Empresa(String razonSocial, String nombre, Integer cuit, String logo, Set<Sucursal> sucursales) {
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.cuit = cuit;
        this.logo = logo;
        this.sucursales = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
}
