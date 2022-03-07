package company.spring_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import company.spring_jpa.entity.Producto;
import company.spring_jpa.repository.ProductoRespository;

@Service
public class ProductoServiceDB implements ProductoService {

    @Autowired
    private ProductoRespository productRepo;

    @Override
    public Producto guargarProducto(Producto nuevo_producto) {
        // TODO Auto-generated method stub
        return productRepo.save(nuevo_producto);
    }

    @Override
    public Producto consultarProducto(int id) {
        return productRepo.getById(id);
    }

    @Override
    public Producto eliminarProducto(int id) {
        Producto producto_encontrado = productRepo.findById(id).
        orElseThrow(()-> new Error("NO se encontró al usuario"));
        productRepo.delete(producto_encontrado);
        return producto_encontrado;
    }
    
}
