package co.com.cesde.minimarket.persistencia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_categoria")
private Integer IdCategoria;
@Column(name="nombre_catgoria")
private String nombreCategoria;
@Column(name="estado")
private Boolean estado;

@OneToMany(mappedBy = "categoria")
private List<Producto> productos;






    public Integer getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        IdCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
