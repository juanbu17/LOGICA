package co.com.cesde.minimarket.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTOS")
public class Producto {

    @Column(name = "ID_PRODUCTO")
private Integer idProducto;
    @Column(name = "NOMBRE_PRODUCTO")
private String nombreProducto;
    @Column(name = "ID_CATEGORIA")
private Integer idCategoria;
    @Column(name = "CODIGO_BARRAS")
private String codigoBarras;
    @Column(name = "PRECIO_VENTA")
private Double precioVenta;
    @Column(name = "CANTIDAD_STOCK")
private Integer cantidadStock;
    private Boolean estado;



    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
