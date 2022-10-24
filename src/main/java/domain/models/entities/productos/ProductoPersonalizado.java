package domain.models.entities.productos;

import domain.models.entities.productos.personalizaciones.Personalizacion;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ProductoPersonalizado {
    @Getter @Setter
    private ProductoBase productoBase;
    @Getter
    private List<Personalizacion> personalizaciones;
    private Integer precioFinal=0;

    public ProductoPersonalizado(){
        this.personalizaciones=new ArrayList<>();
    }

    public void agregarPersonalizacion(Personalizacion personalizacion){
        if(productoBase.getPosiblesPersonalizaciones().contains(personalizacion.getPosiblePersonalizacion())){
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

