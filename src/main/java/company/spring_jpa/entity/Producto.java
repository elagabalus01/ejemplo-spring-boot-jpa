package company.spring_jpa.entity;


import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column
    private String nombre;
    @Column
    private float precio;
    
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public float getPrecio(){
        return this.precio;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

}
