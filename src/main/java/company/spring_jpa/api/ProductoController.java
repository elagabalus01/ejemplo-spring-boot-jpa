package company.spring_jpa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import company.spring_jpa.entity.Producto;
// import company.spring_jpa.service.ProductoService;
import company.spring_jpa.service.ProductoServiceDB;


@RestController
public class ProductoController {
    @Autowired
    private ProductoServiceDB productService;

    @GetMapping(value="/")
    public String saludo() {
        return "Hola mundo";
    }


    @GetMapping(value="/producto/{id}")
    public Producto create(@PathVariable("id") int id) {
        Producto producto_encontado = productService.consultarProducto(id);
        return producto_encontado;
    }

    @PostMapping(value="/producto")
    public Producto create(@RequestBody Producto nuevo_producto) {
        productService.guargarProducto(nuevo_producto);
        return nuevo_producto;
    }

    @DeleteMapping(value = "/producto/{id}")
    public Producto delete (@PathVariable("id") int id){
        return productService.eliminarProducto(id);
    }
    
}
