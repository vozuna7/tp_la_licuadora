package domain.models.entities.productos;

import domain.models.entities.productos.personalizaciones.PosiblePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ProductoBase {
    private String nombre;
    private String descripcion;
    private Integer precioBase;
    private Integer tiempoDeFabricacion;
    private List<PosiblePersonalizacion> posiblesPersonalizaciones;

    public void agregarPosiblePersonalizaciones(PosiblePersonalizacion personalizacion){
        this.posiblesPersonalizaciones.add(personalizacion);
        return;
    }
    public void quitarPosiblePersonalizaciones(PosiblePersonalizacion personalizacion){
        this.posiblesPersonalizaciones.remove(personalizacion);
        return;
    }
}
