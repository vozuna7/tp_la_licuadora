package domain.dao.productos.personalizaciones;

import domain.models.entities.productos.personalizaciones.PosiblePersonalizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "posible_personalizacion")
public interface PosiblePersonalizacionDao extends JpaRepository<PosiblePersonalizacion,Long> {
}
