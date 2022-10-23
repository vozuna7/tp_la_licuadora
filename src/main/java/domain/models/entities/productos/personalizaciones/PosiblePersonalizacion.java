package domain.models.entities.productos.personalizaciones;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PosiblePersonalizacion {
    /*
    - Área de personalización
	- Tipo de personalización
     */
    private AreaDePersonalizacion area;
    private TipoDePersonalizacion tipo;
}
