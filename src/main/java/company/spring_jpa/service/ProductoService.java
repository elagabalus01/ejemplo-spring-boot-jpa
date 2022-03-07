package company.spring_jpa.service;

import company.spring_jpa.entity.Producto;

public interface ProductoService{

    Producto guargarProducto(Producto nuevo_producto);
    Producto consultarProducto(int id);
    Producto eliminarProducto(int id);
    
}