package domain.models.entities.productos;

import domain.models.entities.Persistente;
import domain.models.entities.productos.personalizaciones.Personalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto_personalizado")
public class ProductoPersonalizado extends Persistente {
    @Getter @Setter
    @OneToOne(cascade = CascadeType.PERSIST)
    private ProductoBase productoBase;
    @Getter
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name="producto_y_personalizacion",joinColumns = @JoinColumn(name="producto_personalizado_id", referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="personalizaciones_id",referencedColumnName = "id"))
    private List<Personalizacion> personalizaciones;
    @Column(name="precio_final")
    private Integer precioFinal=0;

    public ProductoPersonalizado(){
        this.personalizaciones=new ArrayList<>();
    }

    public void agregarPersonalizacion(Personalizacion personalizacion){
        if(productoBase.getPosiblesPersonalizaciones().
                contains(personalizacion.getPosiblePersonalizacion())){
            if(this.personalizaciones.size()<3){
                this.personalizaciones.add(personalizacion);
            }
            else {
                //TODO
            }
        }
        else {
            //TODO
        }
    }
    public void quitarPersonalizacion(Personalizacion personalizacion){
        this.personalizaciones.remove(personalizacion);
    }
    public int obtenerPrecioFinal(){
        precioFinal= productoBase.getPrecioBase();
        this.personalizaciones.forEach(personalizacion -> precioFinal=precioFinal+personalizacion.getPrecio());
        return precioFinal;
    }

    @Override
    public String toString() {
        return "ProductoPersonalizado{" +
                "productoBase=" + productoBase +
                ", personalizaciones=" + personalizaciones +
                ", precioFinal=" + obtenerPrecioFinal() +
                '}';
    }
}

