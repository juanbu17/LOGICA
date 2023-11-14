package co.com.cesde.minimarket.persistencia.crud;

import co.com.cesde.minimarket.persistencia.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProdutoCrudRepository extends CrudRepository<Producto,Integer>{

    List<Producto> findByIdCategoraOrderByNombreProductoAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
