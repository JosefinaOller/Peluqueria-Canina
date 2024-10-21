
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();
    
    //Mascota
    
    public void crearMascota(Mascota mas){
        
        control.crearMascota(mas);
    }
    
    public void eliminarMascota(int id){
        
        control.eliminarMascota(id);
    }
    
    public void editarMascota(Mascota mas){
        
        control.editarMascota(mas);
    }
    
    public Mascota traerMascota(int id){
        
        return control.traerMascota(id);
    }
    
    public List <Mascota> traerListaMascotas(){
        
        return control.traerListaMascotas();
    }
    
    //Duenio
    
    public void crearDuenio(Duenio due){
        
        control.crearDuenio(due);
    }
    
    public void eliminarDuenio(int id){
        
        control.eliminarDuenio(id);
    }
    
    public void editarDuenio(Duenio due){
        
        control.editarDuenio(due);
    }
    
    public Duenio traerDuenio(int id){
        
        return control.traerDuenio(id);
    }
    
    public List <Duenio> traerListaDuenios(){
        
        return control.traerListaDuenios();
    }

    public void guardar(String nombre_mascota, String celular_duenio, 
            String color_mascota, String nombre_duenio, String raza_mascota, 
            String observaciones , String alergico, String atencion_especial) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nombre_duenio);
        duenio.setCelular(celular_duenio);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre_mascota);
        mascota.setColor(color_mascota);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencion_especial);
        mascota.setRaza(raza_mascota);
        mascota.setObservaciones(observaciones);
        mascota.setDuenio(duenio);
        
        control.guardar(mascota, duenio);
      
    }

    public void modificarMascota(Mascota mascota,String nombre_mascota, String celular_duenio, 
            String color_mascota, String nombre_duenio, String raza_mascota, 
            String observaciones , String alergico, String atencion_especial) {
        
        
        mascota.setNombre(nombre_mascota);
        mascota.setColor(color_mascota);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencion_especial);
        mascota.setRaza(raza_mascota);
        mascota.setObservaciones(observaciones);
        
        control.editarMascota(mascota);
        
        Duenio duenio = this.buscarDuenio (mascota.getDuenio().getId_duenio());
        
        duenio.setNombre(nombre_duenio);
        duenio.setCelular(celular_duenio);
        
        this.modificarDuenio(duenio);
        
      
    }

    private Duenio buscarDuenio(int id_duenio) {
        return control.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) {
        control.editarDuenio(duenio);
    }
    
}
