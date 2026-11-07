package catalogo.producto.repository;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import catalogo.producto.model.Producto;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.json.JsonMapper;

@Repository 
public class ProductoRepository {

    private final List<Producto> listaProductos;

    public ProductoRepository(JsonMapper jsonMapper) throws IOException{

        var recurso = new ClassPathResource("data/productos.json");
        try (var entrada = recurso.getInputStream()){
            listaProductos = List.copyOf(jsonMapper.readValue(entrada, new TypeReference<List<Producto>>() {}));

        }
    }

    public List<Producto> listar(){
        return listaProductos;
    }


}
