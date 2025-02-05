package app.api.v1.entity;

import lombok.Data;

@Data
public class ProductosEntity {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidad;


}
