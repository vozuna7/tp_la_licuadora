package domain.models.entities.productos;

import domain.models.entities.productos.personalizaciones.PosiblePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ProductoPersonalizado {
    @Getter @Setter
    private ProductoBase productoBase;
    @Getter
    private List<PosiblePersonalizacion> personalizaciones;
    private Integer precioFinal;

}
