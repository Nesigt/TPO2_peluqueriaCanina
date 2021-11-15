/*
IMPORTANTE: Si usted utiliza la tecla TAB para cambiar de textfield, le recomiendo que no lo haga.
No supe utilizar el evento luego de obtener el mismo de la tecla TAB, quizás lo estaba haciendo mal.
Recomiendo utilizar el mouse para seleccionar el campo.
*/
package logica;

import igu.Principal;
import persistence.ControladoraPersistencia;

public class Main{
    public static void main(String[] args) {
        Controladora control = new Controladora();
        
//        Mascotas mascota = new Mascotas(0, "Tuerca", "firulais", "negro", "No", "No", "Gian Carlos", 1234123456, "Es agresivo cuando se moja");
//        control.crearMascota(mascota);
        
        Principal iniciarPantalla = new Principal(control);
        iniciarPantalla.setVisible(true);
        iniciarPantalla.setLocationRelativeTo(null);
        
        
        
        
        
        
    }
}
