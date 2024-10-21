package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenioJpaController duenio = new DuenioJpaController();
    MascotaJpaController mascota = new MascotaJpaController();
    
    public void guardar(Mascota mas,Duenio due){
        duenio.create(due);
        mascota.create(mas);
        
    }

    public void crearMascota(Mascota mas) {
        mascota.create(mas);
    }

    public void eliminarMascota(int id) {
        try {
            mascota.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMascota(Mascota mas) {
        try {
            mascota.edit(mas);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int id) {
        return mascota.findMascota(id);
    }

    public List <Mascota> traerListaMascotas() {
        return mascota.findMascotaEntities();
    }

    public void crearDuenio(Duenio due) {
        duenio.create(due);
    }

    public void eliminarDuenio(int id) {
        try {
            duenio.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarDuenio(Duenio due) {
        try {
            duenio.edit(due);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id) {
        return duenio.findDuenio(id);
    }

    public List <Duenio> traerListaDuenios() {
        return duenio.findDuenioEntities();
    }
}
