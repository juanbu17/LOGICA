package co.com.cesde.minimarket.persistencia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer IdCategoria;
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
    @Column(name = "estado")
    private Integer estado;

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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
