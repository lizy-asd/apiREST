package app.api.v1.controller;

import app.api.v1.entity.ProductosEntity;
import app.api.v1.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/producto")
public class ProductosController {

    @Autowired
    ProductosService productosService;

    @GetMapping
    public List<ProductosEntity> getProductos(){
        return productosService.serviciosDeProductos();
    }

    @GetMapping ("/{id}")
    public ProductosEntity productosId(@PathVariable String id){
        return productosService.productosId(id);
    }

   @PostMapping("/insert")
   ResponseEntity<?> insertProductos(@RequestBody ProductosEntity productosEntity){
        productosService.insertProductos(productosEntity);
        Map<String, Object> response = new HashMap<>();
        response.put("mensaje", "Producto insertado correctamente");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
   }



}
