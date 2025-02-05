package app.api.v1.controller;

import app.api.v1.entity.ProductosEntity;
import app.api.v1.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ProductosController {

    @Autowired
    ProductosService productosService;

    @GetMapping
    public List<ProductosEntity> getProductos(){
        return productosService.serviciosDeProductos();
    }

}
