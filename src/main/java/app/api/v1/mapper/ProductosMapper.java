package app.api.v1.mapper;

import app.api.v1.entity.ProductosEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductosMapper {

    @Select("SELECT * FROM productos")
    List<ProductosEntity> query();
}
