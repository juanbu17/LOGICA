package co.com.cesde.minimarket.persistencia.mapper;

import co.com.cesde.minimarket.dominio.Product;
import co.com.cesde.minimarket.persistencia.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel="spring",uses = {CategoryMapper.class})
public interface ProductMapper {
   @Mappings({
           @Mapping(source="idProducto" ,target="productId"),
           @Mapping(source="nombreProducto" ,target="name"),
           @Mapping(source="IdCategoria" ,target="categoryId"),
           @Mapping(source="precioVenta" ,target="price"),
           @Mapping(source="cantidadstock" ,target="stock"),
           @Mapping(source="estado" ,target="active"),
           @Mapping(source="categoria" ,target="category"),

   })
   Product product(Producto producto);
   List<Product> toProducts(List<Producto>productos);
   @InheritInverseConfiguration
    @Mapping(target="codigoBarras",ignore=true)
   Producto producto(Product product);

}
