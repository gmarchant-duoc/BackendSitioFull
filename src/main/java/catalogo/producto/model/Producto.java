package catalogo.producto.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class Producto {
    private final int id;
    private final String nombre;
    private final String imagen;
    private final int precio;

@JsonCreator 
public Producto(
    @JsonProperty ("id") int id,
    @JsonProperty ("nombre") String nombre,
    @JsonProperty ("imagen") String imagen,
    @JsonProperty ("precio") int precio){
        this.id=id;
        this.nombre=nombre;
        this.imagen=imagen;
        this.precio=precio;
    }

}
