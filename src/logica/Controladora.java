package logica;

import persistence.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearMascota(Mascotas mascota){
        controlPersis.crearMascota(mascota);
    }

    public void crearMascota(String nombrePerro, String raza, String color, String alergico, String atencion, String nombreDuenio, int numCelular, String obser) {
        Mascotas mascota = new Mascotas();
        mascota.setNombre_perro(nombrePerro);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtención_especial(atencion);
        mascota.setNombre_duenio(nombreDuenio);
        mascota.setCelular_duenio(numCelular);
        mascota.setObservaciones(obser);
        
        controlPersis.crearMascota(mascota);
    }
}
