package co.com.cesde.minimarket.persistencia.entity;

import javax.persistence.*;

@Entity
@Table(name = "COMPRAS_PRODUCTO")
public class ComprasProducto {
    @EmbeddedId

    private ComprasProductoPk id;
    private Integer cantidad;
    private Double total;
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "ID_COMPRAS", insertable = false, updatable = false)
    private Compra compra;


    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTOS", insertable = false, updatable = false)
    private Producto productos;




    //getter and setter
    public ComprasProductoPk getId() {
        return id;
    }

    public void setId(ComprasProductoPk id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
