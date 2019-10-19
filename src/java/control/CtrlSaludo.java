package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/* @author FranciscoHC */

/** Controla las acciones de la forma.
 * <p>
 * La anotacion <code>@Named(value = "ctrlSaludo")</code> indica que el nombre
 * en la vista es ctrlSaludo.
 * </p>
 * <p>
 * La anotación <code>@RequestScoped</code> indica que el controlador se
 * mantiene válido durante una solicitud HTTP. Si ha más solicitudes se crea
 * y usa otro objeto.
 * </p>
 * <p>
 * Los objetos de esta clase tienen una estructura de Java Bean; es decir,
 * tienen constructor en blanco y los datos accesibles usan los métodos set y
 * get.
 * </p> */

@Named(value = "ctrlSaludo")
@RequestScoped
public class CtrlSaludo {
    
    private String nombre;
    /** Devuelve el valor de nombre.
     * @return el valor de nombre */
    public String getNombre() {
        return nombre;
    }
    /** Asigna el valor de nombre.
     * @param nombre el valor de nombre*/
    public void setNombre(String nombre){ 
        this.nombre = nombre;
    }
    
    public void saluda() {
        final String saludo = "Hola " + getNombre() + ".";
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(saludo));
    }
}
