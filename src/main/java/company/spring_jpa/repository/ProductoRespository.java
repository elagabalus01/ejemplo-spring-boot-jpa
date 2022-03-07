package company.spring_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import company.spring_jpa.entity.Producto;

public interface ProductoRespository extends JpaRepository<Producto,Integer> {
    
}
