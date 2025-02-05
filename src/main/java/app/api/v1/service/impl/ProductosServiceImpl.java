package app.api.v1.service.impl;

import app.api.v1.entity.ProductosEntity;
import app.api.v1.mapper.ProductosMapper;
import app.api.v1.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService {

    @Autowired
    private ProductosMapper productosMapper;

    @Override
    public List<ProductosEntity> serviciosDeProductos() {
        return productosMapper.query();
    }
}
