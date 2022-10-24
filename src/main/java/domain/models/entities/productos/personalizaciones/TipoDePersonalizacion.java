package domain.models.entities.productos.personalizaciones;

import domain.models.entities.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter
@Entity
@Table(name="tipo_de_pesonalizacion")
public class TipoDePersonalizacion extends Persistente {
    /*
    - Ejemplos: : texto, imagen color, imagen blanco y negro, emoji, etc.
     */
    @Column(name="tipo")
    private String tipo;

    @Override
    public String toString() {
        return "TipoDePersonalizacion{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
