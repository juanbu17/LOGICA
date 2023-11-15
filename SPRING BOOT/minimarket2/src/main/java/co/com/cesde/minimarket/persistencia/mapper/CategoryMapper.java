package co.com.cesde.minimarket.persistencia.mapper;

import co.com.cesde.minimarket.dominio.Category;
import co.com.cesde.minimarket.persistencia.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({

        @Mapping(source = "idCategoria", target = "categoriaId"),
        @Mapping(source = "nombre_categoria", target = "category"),
        @Mapping(source = "estado", target = "active")

    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mappings(target = "productos", ignore = true)
    Categoria toCategoria(Categoria category);
}
