package domain.models.entities.productos;

import domain.models.entities.Persistente;
import domain.models.entities.productos.personalizaciones.PosiblePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
@Table(name="producto_base")
public class ProductoBase extends Persistente {
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="precio_base")
    private Integer precioBase;
    @Column(name="tiempo_de_fabricacion")
    private Integer tiempoDeFabricacion;
    @OneToMany(mappedBy = "producto")
    private List<PosiblePersonalizacion> posiblesPersonalizaciones;

    public ProductoBase(){
        this.posiblesPersonalizaciones=new ArrayList<>();
    }

    public void agregarPosiblePersonalizaciones(PosiblePersonalizacion personalizacion){
        this.posiblesPersonalizaciones.add(personalizacion);
        return;
    }
    public void quitarPosiblePersonalizaciones(PosiblePersonalizacion personalizacion){
        this.posiblesPersonalizaciones.remove(personalizacion);
        return;
    }

    @Override
    public String toString() {
        return "ProductoBase{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioBase=" + precioBase +
                ", tiempoDeFabricacion=" + tiempoDeFabricacion +
                ", posiblesPersonalizaciones=" + posiblesPersonalizaciones +
                '}';
    }
}
