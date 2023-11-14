package co.com.cesde.minimarket.persistencia;

import co.com.cesde.minimarket.persistencia.crud.ProdutoCrudRepository;
import co.com.cesde.minimarket.persistencia.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProdutoCrudRepository productoCrudRepository;

    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete (int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
}
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoraOrderByNombreProductoAsc(idCategoria);
    }
public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
}
}
