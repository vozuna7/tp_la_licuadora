package domain.models.entities.productos.personalizaciones;

import domain.models.entities.Persistente;
import domain.models.entities.productos.ProductoBase;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="posible_personalizacion")
public class PosiblePersonalizacion extends Persistente {

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="id_area")
    private AreaDePersonalizacion area;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="id_tipo")
    private TipoDePersonalizacion tipo;

    /*
    @ManyToOne
    @JoinColumn(name="fk_producto_base")
    private ProductoBase producto;
     */

    @Override
    public String toString() {
        return "PosiblePersonalizacion{" +
                "area=" + area +
                ", tipo=" + tipo +
                '}';
    }
}
