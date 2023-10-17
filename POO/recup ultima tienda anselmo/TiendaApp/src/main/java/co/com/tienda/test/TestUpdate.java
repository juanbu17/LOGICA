package co.com.tienda.test;

import co.com.tienda.services.ProductoService;

public class TestUpdate {
    public static void main(String[] args) {
        ProductoService ps = new ProductoService();
        ProductoService.listarProductos();
        ProductoService.modificarProducto();
    }
}
