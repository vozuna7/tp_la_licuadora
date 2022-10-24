package domain.models.entities.productos.personalizaciones;

import domain.models.entities.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter
@Entity
@Table(name="area_de_personalizacion")
public class AreaDePersonalizacion extends Persistente {
    /*
    - Ejemplos: frente, torso, trasera-central, etc.
     */
    @Column(name="area")
    private String area;

    @Override
    public String toString() {
        return "AreaDePersonalizacion{" +
                "area='" + area + '\'' +
                '}';
    }
}
