package org.example;

import java.util.HashSet;
import java.util.Set;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Empresa {
    private Integer idEmpresa;
    private String nombre;
    private String razonSocial;
    private Integer cuit;
    private String logo;
    private Set<Sucursal> sucursales;

    private static Set<Empresa> empresas = new HashSet<>();

    //Metodo para agregar una empresa a una lista
    public static void agregarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }
    //Mostrar todas las empresas
    public void mostrarEmpresas(){

            System.out.println("Empresa: " + nombre);
        System.out.println( "id: " + idEmpresa);
        System.out.println( "razon social: " + razonSocial);
    }

    public static Empresa buscarPorID (Integer idEmpresa) {
        Empresa empresaEncontrada=null;
        for (Empresa empresa: empresas) {
            if (empresa.getIdEmpresa().equals(idEmpresa)){
                return empresa;
            }
        }
        return null;
    }

    public static Set<Empresa> buscarPorNombre(String nombre) {  // Devuelve un Set porque puede haber varias empresas con el mismo nombre
        Set<Empresa> empresasEncontradas = new HashSet<>();
        for (Empresa empresa : empresas) {
            if (empresa.getNombre().equalsIgnoreCase(nombre)) {  // Compara nombres (ignora mayúsculas/minúsculas)
                empresasEncontradas.add(empresa);
            }
        }
        return empresasEncontradas;  // Devuelve todas las empresas con ese nombre
    }
    public static boolean actualizarCuitPorId(Integer idEmpresa, Integer nuevoCuit) {
        Empresa empresa = buscarPorID(idEmpresa);
        if (empresa != null) {
            empresa.setCuit(nuevoCuit);
            return true; // actualización exitosa
        }
        return false; // no se encontró empresa con ese ID
    }
    public static boolean eliminarEmpresa(Integer id) {
        Empresa empresaAEliminar = buscarPorID(id);
        if (empresaAEliminar != null) {
            empresas.remove(empresaAEliminar);
            return true;  // Indica que la eliminación fue exitosa
        }
        return false;  // Indica que no se encontró la empresa
    }

}
