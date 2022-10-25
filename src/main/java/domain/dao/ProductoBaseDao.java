package domain.dao;
//Dao vendria a ser el Repositorio

import domain.models.entities.productos.ProductoBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "productos_base")
public interface ProductoBaseDao extends JpaRepository<ProductoBase,Long> {

    @Override @RestResource(exported = false)
    void deleteById(Long id);

    @Override @RestResource(exported = false)
    void delete(ProductoBase producto);


    ProductoBase findByNombre(String nombre);
}
