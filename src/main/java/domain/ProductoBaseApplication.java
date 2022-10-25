package domain;

import domain.dao.ProductoBaseDao;
import domain.dao.ProductoPersonalizadoDao;
import domain.models.entities.productos.ProductoBase;
import domain.models.entities.productos.ProductoPersonalizado;
import domain.models.entities.productos.personalizaciones.AreaDePersonalizacion;
import domain.models.entities.productos.personalizaciones.Personalizacion;
import domain.models.entities.productos.personalizaciones.PosiblePersonalizacion;
import domain.models.entities.productos.personalizaciones.TipoDePersonalizacion;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductoBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductoBaseApplication.class,args);
    }
    @Bean
    public CommandLineRunner init(ProductoBaseDao repo, ProductoPersonalizadoDao repoPer){
        return (xd) ->{
            AreaDePersonalizacion espalda=new AreaDePersonalizacion();
            espalda.setArea("Espalda");
            TipoDePersonalizacion foto= new TipoDePersonalizacion();
            foto.setTipo("Foto");

            PosiblePersonalizacion fotoEnLaEspalda = new PosiblePersonalizacion();
            fotoEnLaEspalda.setArea(espalda);
            fotoEnLaEspalda.setTipo(foto);


            ProductoBase remeraBlanca = new ProductoBase();
            remeraBlanca.setNombre("Remera");
            remeraBlanca.setDescripcion("Una remera blanca xd");
            remeraBlanca.setPrecioBase(200);
            remeraBlanca.agregarPosiblePersonalizaciones(fotoEnLaEspalda);
            remeraBlanca.setTiempoDeFabricacion(2);
            repo.save(remeraBlanca);

            Personalizacion fotoEnLaEspaldaFinal = new Personalizacion();
            fotoEnLaEspaldaFinal.setPosiblePersonalizacion(fotoEnLaEspalda);
            fotoEnLaEspaldaFinal.setContenido("Foto de Messi");
            fotoEnLaEspaldaFinal.setNombre("Una foto de Messi en la espalda");
            fotoEnLaEspaldaFinal.setPrecio(50);

            ProductoPersonalizado remeraBlancaConFoto = new ProductoPersonalizado();
            remeraBlancaConFoto.setProductoBase(remeraBlanca);
            remeraBlancaConFoto.agregarPersonalizacion(fotoEnLaEspaldaFinal);

            repoPer.save(remeraBlancaConFoto);
        };
    }
}
