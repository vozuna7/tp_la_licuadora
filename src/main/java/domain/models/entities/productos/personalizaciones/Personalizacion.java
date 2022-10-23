package domain.models.entities.productos.personalizaciones;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Personalizacion {
    private PosiblePersonalizacion personalizacion;
    private String contenido;
    private String nombre;
    private Integer precio;
}
