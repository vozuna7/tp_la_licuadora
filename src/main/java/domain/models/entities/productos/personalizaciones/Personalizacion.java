package domain.models.entities.productos.personalizaciones;

import domain.models.entities.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="personalizacion")
public class Personalizacion extends Persistente {

    @ManyToOne
    @JoinColumn(name = "id_posible_personalizacion")
    private PosiblePersonalizacion PosiblePersonalizacion;
    @Column(name="contenido")
    private String contenido;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private Integer precio;

    @Override
    public String toString() {
        return "Personalizacion{" +
                "PosiblePersonalizacion=" + PosiblePersonalizacion +
                ", contenido='" + contenido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
