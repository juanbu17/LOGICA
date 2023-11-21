package co.com.cesde.minimarket.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPk implements Serializable {
    @Column(name = "ID_COMPRAS")
    private Integer idCompras;
    @Column(name = "ID_PRODUCTO")
    private Integer idProducto;



    //----------------------------------------------------------//

    public Integer getIdCompras() {
        return idCompras;
    }

    public void setIdCompras(Integer idCompras) {
        this.idCompras = idCompras;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
