package persistence;

import logica.Mascotas;

public class ControladoraPersistencia {
    MascotasJpaController masJPA = new MascotasJpaController();
    
    //método para alta
    public void crearMascota(Mascotas mascota){
        try{
            masJPA.create(mascota);
        }catch(Exception e){
            System.out.println(mascota == null ? "No se logró realizar el registro de la mascota." : ("Ocurrió un error: " + e));
        }
    }
}
