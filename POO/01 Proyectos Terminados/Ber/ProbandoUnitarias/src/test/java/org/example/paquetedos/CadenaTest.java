package org.example.paquetedos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadenaTest {

    private Cadena cadena;

    @BeforeEach
    public  void setUp(){
        this.cadena = new Cadena();
        this.cadena.setNumeroPuntos(200);
        System.out.println("ya ganamos este curso");
    }

    @Test
    public void registrarCienteCorrecto() {
        String nombreDelCliente = "juan pablo";
        String contrasenaCorrecta = "1234";
        String contrasenaDosCorrecta = "1234";

        Boolean resultado = cadena.registrarClientes(nombreDelCliente,contrasenaCorrecta,contrasenaDosCorrecta);
        Assertions.assertTrue(resultado);

        Assertions.assertDoesNotThrow(()->cadena.registrarClientes(nombreDelCliente,contrasenaCorrecta,contrasenaDosCorrecta));

        Assertions.assertEquals(true,resultado);

    }

}