package app.api.v1.mapper;

import app.api.v1.entity.ProductosEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductosMapper {

    @Select("SELECT * FROM productos")
    List<ProductosEntity> query();

    @Select("SELECT * FROM productos where id = #{id}")
    ProductosEntity productosId(String id);

    @Insert("INSERT INTO productos (nombre, descripcion, precio, cantidad) " +
            "VALUES (#{nombre}, #{descripcion}, #{precio}, #{cantidad})")
    Integer insertProductos(ProductosEntity productosEntity);

}
