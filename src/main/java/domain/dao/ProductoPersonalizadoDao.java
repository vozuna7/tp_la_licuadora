package domain.dao;

import domain.models.entities.productos.ProductoPersonalizado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "productos_personalizados")
public interface ProductoPersonalizadoDao extends JpaRepository<ProductoPersonalizado,Long> {

}


