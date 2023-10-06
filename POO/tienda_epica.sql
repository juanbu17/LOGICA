CREATE DATABASE TIENDA_EPICA
GO
USE TIENDA_EPICA

//crear lata
CREATE TABLE producto (
  Id int(11) NOT NULL,
  Nombre varchar(55) NOT NULL,
  Descripcion varchar(55) NOT NULL,
  precio decimal(18,2) NOT NULL,
  Costo decimal(18,2) NOT NULL,
  Cantidad decimal(18,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- Volcado de datos para la tabla `producto`


INSERT INTO producto ( Nombre, Descripcion, Precio, Costo, Cantidad) VALUES
('Café', 'Mocachino', '6000.00', '2000.00', '20.00'),
( 'Cookies', 'Avena', '12000.00', '1000.00', '20.00'),
( 'Palito de queso', 'unidad', '2500.00', '1000.00', '20.00');

-- Agregar Id en la tabla producto

ALTER TABLE producto
  ADD PRIMARY KEY (Id);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE producto
  MODIFY Id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;


