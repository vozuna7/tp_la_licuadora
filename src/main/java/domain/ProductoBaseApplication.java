package domain;

import domain.dao.productos.ProductoBaseDao;
import domain.dao.productos.ProductoPersonalizadoDao;
import domain.dao.productos.personalizaciones.AreaDePersonalizacionDao;
import domain.dao.productos.personalizaciones.PersonalizacionDao;
import domain.dao.productos.personalizaciones.PosiblePersonalizacionDao;
import domain.dao.productos.personalizaciones.TipoDePersonalizacionDao;
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
    public CommandLineRunner init(ProductoBaseDao repo, ProductoPersonalizadoDao repoProductoPer, AreaDePersonalizacionDao repoArea,
                                  PersonalizacionDao repoPerson, PosiblePersonalizacionDao repoPosiblePer, TipoDePersonalizacionDao repoTipoDePer){
        return (xd) ->{
            AreaDePersonalizacion espalda=new AreaDePersonalizacion();
            espalda.setArea("Espalda");
            repoArea.save(espalda);
            TipoDePersonalizacion foto= new TipoDePersonalizacion();
            foto.setTipo("Foto");
            repoTipoDePer.save(foto);

            PosiblePersonalizacion fotoEnLaEspalda = new PosiblePersonalizacion();
            fotoEnLaEspalda.setArea(espalda);
            fotoEnLaEspalda.setTipo(foto);
            repoPosiblePer.save(fotoEnLaEspalda);


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
            repoPerson.save(fotoEnLaEspaldaFinal);

            ProductoPersonalizado remeraBlancaConFoto = new ProductoPersonalizado();
            remeraBlancaConFoto.setProductoBase(remeraBlanca);
            remeraBlancaConFoto.agregarPersonalizacion(fotoEnLaEspaldaFinal);

            repoProductoPer.save(remeraBlancaConFoto);
        };
    }
}
