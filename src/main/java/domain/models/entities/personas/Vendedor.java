package domain.models.entities.personas;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Vendedor {
    private String nombre;
    private String apellido;
    //Revisar los medios ¿Podrian ser una clase?
    private String mediosDePago;
}
