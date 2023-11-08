package co.com.cesde.minimarket.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

// esta tabla/clase es diferente por ser con dos primary key
@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name="id_compras")
    private Integer idCompras;
    @Column(name="id_productos")
    private Integer idProductos;


    //getters setters
    public Integer getIdCompras() {
        return idCompras;
    }

    public void setIdCompras(Integer idCompras) {
        this.idCompras = idCompras;
    }

    public Integer getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }
}
