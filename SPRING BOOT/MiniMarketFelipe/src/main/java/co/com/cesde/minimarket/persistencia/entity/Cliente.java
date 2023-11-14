package co.com.cesde.minimarket.persistencia.entity;

import javax.lang.model.element.Name;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
    @Id

    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "NOMBRE_CLIENTE")
    private String nombreCliente;
    @Column(name = "APELLIDO_CLIENTE")
    private String apellidoCliente;
    private Double celular;
    private String direccion;
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;


    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;







    //----------------------------------------------//


    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
