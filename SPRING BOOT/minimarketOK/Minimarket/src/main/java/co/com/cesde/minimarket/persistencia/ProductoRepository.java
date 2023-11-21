package co.com.cesde.minimarket.persistencia;

import co.com.cesde.minimarket.persistencia.crud.ProductoCrudRepository;
import co.com.cesde.minimarket.persistencia.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class ProductoRepository {

   private ProductoCrudRepository productoCrudRepository;

   public Optional<Producto> getByProducto(int IdProducto) {
      return productoCrudRepository.findById(IdProducto);

   }

   public Producto save(Producto producto) {
      return productoCrudRepository.save(producto);

   }

   public void delete(int IdProducto) {
      productoCrudRepository.deleteById(IdProducto);
   }

   public Optional<List<Producto>> getByEscasos(int cantidad) {
      return  productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
   }

public List<Producto> getByCategoria(int IdCategoria){
      return productoCrudRepository.findByIdCategoriaOrderByNombreProductoAsc(IdCategoria);
}

public List<Producto> getAll(){
      return (List<Producto>) productoCrudRepository.findAll();
}

}
