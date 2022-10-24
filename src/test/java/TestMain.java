import domain.models.entities.productos.ProductoBase;
import domain.models.entities.productos.ProductoPersonalizado;
import domain.models.entities.productos.personalizaciones.AreaDePersonalizacion;
import domain.models.entities.productos.personalizaciones.Personalizacion;
import domain.models.entities.productos.personalizaciones.PosiblePersonalizacion;
import domain.models.entities.productos.personalizaciones.TipoDePersonalizacion;

public class TestMain {
    public static void main(String[] args) {
        AreaDePersonalizacion espalda=new AreaDePersonalizacion();
        espalda.setArea("Espalda");
        TipoDePersonalizacion foto= new TipoDePersonalizacion();
        foto.setTipo("Foto");

        PosiblePersonalizacion fotoEnLaEspalda = new PosiblePersonalizacion();
        fotoEnLaEspalda.setArea(espalda);
        fotoEnLaEspalda.setTipo(foto);


        ProductoBase remeraBlanca = new ProductoBase();
        remeraBlanca.setNombre("Remera blanca");
        remeraBlanca.setDescripcion("Una remera blanca xd");
        remeraBlanca.setPrecioBase(200);
        remeraBlanca.agregarPosiblePersonalizaciones(fotoEnLaEspalda);
        remeraBlanca.setTiempoDeFabricacion(2);

        Personalizacion fotoEnLaEspaldaFinal = new Personalizacion();
        fotoEnLaEspaldaFinal.setPosiblePersonalizacion(fotoEnLaEspalda);
        fotoEnLaEspaldaFinal.setContenido("Foto de Messi");
        fotoEnLaEspaldaFinal.setNombre("Una foto de Messi en la espalda");
        fotoEnLaEspaldaFinal.setPrecio(50);

        System.out.println(remeraBlanca);
        /*



        ProductoPersonalizado remeraBlancaConFoto = new ProductoPersonalizado();
        remeraBlancaConFoto.setProductoBase(remeraBlanca);
        remeraBlancaConFoto.agregarPersonalizacion(fotoEnLaEspaldaFinal);

        System.out.println(remeraBlancaConFoto);

         */
    }
}
