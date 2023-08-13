package com.kike.projectmarket.persistence.mapper;

import com.kike.projectmarket.domain.Category;
import com.kike.projectmarket.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source ="idCategoria" , target = "categoryId"),
            @Mapping(source ="descripcion" , target = "category"),
            @Mapping(source ="estado" , target = "active"),
    })
    Category toCategory(Categoria categoria);


    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);

}
