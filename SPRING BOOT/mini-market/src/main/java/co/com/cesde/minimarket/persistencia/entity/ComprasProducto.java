package co.com.cesde.minimarket.persistencia.entity;

import javax.persistence.*;

@Entity
@Table(name="compras_producto")
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;

    private Double total;

    private Integer estado;



    @ManyToOne
    @JoinColumn(name="ID_COMPRAS", insertable = false,updatable = true)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name="ID_PRODUCTOS", insertable = false,updatable = true)
    private Producto producto;




    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
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
