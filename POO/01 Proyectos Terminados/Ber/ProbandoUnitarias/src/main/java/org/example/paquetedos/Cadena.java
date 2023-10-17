package org.example.paquetedos;

public class Cadena extends SuperMercado{

    private Integer numeroSucursales;

    private Integer numeroPuntos;

    public Cadena() {
    }

    @Override
    public Double pagarCompra() throws Exception{
       if(this.numeroPuntos>100){
           return 100000-(100000*0.2);
       }else{
           throw new Exception("No puede pagar con puntos");
       }
    }

    public Cadena(String nombre, String nit, Integer valorInventario, Integer numeroSucursales) {
        super(nombre, nit, valorInventario);
        this.numeroSucursales = numeroSucursales;
    }

    public Integer getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(Integer numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public Integer getNumeroPuntos() {
        return numeroPuntos;
    }

    public void setNumeroPuntos(Integer numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
    }
    public Boolean registrarClientes(String nombres, String constrasena,String contrasenaDos){
       if (constrasena.equals(contrasenaDos)){
           return true;
       }else {
           return false;
       }
    }
}
