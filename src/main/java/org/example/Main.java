package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pais argentina= new Pais("Argentina");

        Provincia buenosAires= new Provincia("Buenos Aires", argentina);
        Localidad caba= new Localidad("CABA", buenosAires);
        Domicilio dom1=new Domicilio("9 de Julio", 554, 1100, caba);
        Localidad laPlata= new Localidad("La Plata", buenosAires);
        Domicilio dom2=new Domicilio("Sarmiento", 1221, 1000, laPlata);

        Provincia cordoba= new Provincia("Cordoba", argentina);
        Localidad cordobaCapital= new Localidad("Cordoba Capital", cordoba);
        Domicilio dom3=new Domicilio("Ramirez", 1234, 5400, cordobaCapital);
        Localidad villaCarlosPaz=new Localidad("Villa Carlos Paz", cordoba);
        Domicilio dom4= new Domicilio("alberti", 753, 5000,villaCarlosPaz);

        Sucursal sucursal1=new Sucursal("Sucursal Uno", 8, 18, true, dom1);
        Sucursal sucursal2=new Sucursal("Sucursal Dos", 10, 20,false, dom2);
        Sucursal sucursal3=new Sucursal("Sucursal Tres", 8,17, false, dom3);
        Sucursal sucursal4= new Sucursal("Sucursal Cuatro", 8, 22, true, dom4);

    }
}