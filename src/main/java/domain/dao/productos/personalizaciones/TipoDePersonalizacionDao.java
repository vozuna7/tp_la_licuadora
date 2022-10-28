package domain.dao.productos.personalizaciones;

import domain.models.entities.productos.personalizaciones.TipoDePersonalizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TipoDePersonalizacionDao extends JpaRepository<TipoDePersonalizacion,Long> {
}
