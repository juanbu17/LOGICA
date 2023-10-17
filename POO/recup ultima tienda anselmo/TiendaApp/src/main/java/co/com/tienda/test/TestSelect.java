package co.com.tienda.test;

import co.com.tienda.services.ProductoService;

public class TestSelect {

    public static void main(String[] args) {

        ProductoService productoService= new ProductoService();
        ProductoService.listarProductos();

    }
}
