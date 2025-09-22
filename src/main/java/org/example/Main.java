package org.example;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pais argentina = new Pais("Argentina");
        Provincia buenosAires = new Provincia("Buenos Aires", argentina);
        Localidad caba = new Localidad("Caba", buenosAires);
        Domicilio domicilioCaba = new Domicilio("Calle 1", 123, 1100, caba);

        Localidad laPlata = new Localidad("La Plata", buenosAires);
        Domicilio domicilioLaPlata = new Domicilio("Calle 2", 456, 1200, laPlata);

        Provincia cordoba = new Provincia("Córdoba", argentina);
        Localidad cordobaCapital = new Localidad("Córdoba Capital", cordoba);
        Domicilio domicilioCordobaCapital = new Domicilio("Calle 3", 789,3000, cordobaCapital);

        Localidad villaCarlosPaz = new Localidad("Villa Carlos Paz", cordoba);
        Domicilio domicilioVillaCarlosPaz = new Domicilio("Calle 4", 1011, 3300, villaCarlosPaz);

        Sucursal sucursal1 = new Sucursal("Sucursal Caba", LocalTime.of(8, 0), LocalTime.of(18, 0), true, domicilioCaba);
        Sucursal sucursal2 = new Sucursal("Sucursal La Plata",LocalTime.of(8, 0) , LocalTime.of(19, 0), true, domicilioLaPlata);

        Sucursal sucursal3 = new Sucursal("Sucursal Córdoba Capital",LocalTime.of(9, 0) , LocalTime.of(20, 0), true,domicilioCordobaCapital);

        Sucursal sucursal4 = new Sucursal("Sucursal Villa Carlos Paz",LocalTime.of(8, 0) , LocalTime.of(18, 0), true, domicilioVillaCarlosPaz);

        Empresa empresa1 = new Empresa(
                1,
                "FasterFoodie",
                "FasterFoodie S.A",
                1001,
                "logo1.png",
                new HashSet<>(Arrays.asList(sucursal1, sucursal2))
        );

        Empresa empresa2 = new Empresa(
                2,
                "FastFoodie",
                "FastFoodie S.A",
                1121,
                "logo2.png",
                new HashSet<>(Arrays.asList(sucursal3, sucursal4))
        );
        //agregamos las empresas a la lista empresas
        Empresa.agregarEmpresa(empresa1);
        Empresa.agregarEmpresa(empresa2);

        System.out.println("Mostrar todas las empresas");
        empresa1.mostrarEmpresas();
        System.out.println(" ");
        empresa2.mostrarEmpresas();

        Empresa e = Empresa.buscarPorID(1);
        if (e==null){
            System.out.println("No se encontró");
        } else {
            System.out.println("Se encontró: " + e);
        }
        System.out.println(" ");
        Set<Empresa> empresasEncontradas = Empresa.buscarPorNombre("FasterFoodie");
        if (empresasEncontradas.isEmpty()) {
            System.out.println("No se encontraron empresas con ese nombre.");
        } else {
            System.out.println("Empresas encontradas por nombre:");
            empresasEncontradas.forEach(empresa ->
                    System.out.println(empresa.getNombre() + " - CUIT: " + empresa.getCuit())
            );
        }
        boolean actualizado = Empresa.actualizarCuitPorId(2, 999999);

        if (actualizado) {
            System.out.println("\nDespués de actualizar:");
            Empresa.buscarPorID(2).mostrarEmpresas();
        } else {
            System.out.println("No se encontró la empresa con ese ID");
        }

        // Eliminar la empresa con ID 1
        boolean eliminada = Empresa.eliminarEmpresa(1);
        if (eliminada) {
            System.out.println("\nEmpresa eliminada correctamente.");
        } else {
            System.out.println("\nNo se encontró la empresa con ese ID.");
        }
    }

}