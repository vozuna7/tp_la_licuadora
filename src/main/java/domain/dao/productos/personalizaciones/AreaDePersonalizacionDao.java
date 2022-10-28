package domain.dao.productos.personalizaciones;

import domain.models.entities.productos.personalizaciones.AreaDePersonalizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AreaDePersonalizacionDao extends JpaRepository<AreaDePersonalizacion,Long> {
}
