package co.com.cesde.minimarket.persistencia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "ID_CLIENTE")
    private Integer IdCliente;

    @Column(name = "NOMBRE_CLIENTE")
    private String nombreCliente;

    @Column(name = "APELLIDO_CLIENTE")
    private String apellidoCliente;


    @Column(name = "CELULAR")
    private Double celular;

    private String direccion;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectonico;


    @OneToMany(mappedBy = "cliente")//se mapea de la clase compra el atributo de tipo Cliente que se llama cliente
    private List<Compra> compras;



    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer idCliente) {
        IdCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public Double getCelular() {
        return celular;
    }

    public void setCelular(Double celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectonico() {
        return correoElectonico;
    }

    public void setCorreoElectonico(String correoElectonico) {
        this.correoElectonico = correoElectonico;
    }
}
