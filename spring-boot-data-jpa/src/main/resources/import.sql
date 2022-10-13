INSERT INTO clientes(id, nombre, apellido, email, create_at, celular) VALUES(1, 'Pepito', 'Perez', 'pp@gmail.com', '2019-05-24', 3004568978);
INSERT INTO clientes(id, nombre, apellido, email, create_at, celular) VALUES(2, 'Sebastian', 'Pertuz', 'sebas@gmail.com', '2020-10-31', 3116540851);


INSERT INTO productos(id, nombre_producto, fecha, cantidad, precio, precio_compra) VALUES(1, 'Chocorramo', '2020-10-31', 36, 35000, 40000);
INSERT INTO productos(id, nombre_producto, fecha, cantidad, precio, precio_compra) VALUES(2, 'Bom bom bum', '2020-10-15', 76, 3000, 4000);


INSERT INTO encabezado_pedidos(id_pedido, cel_destino, descuento, dir_destino, estado, fecha, fecha_entrega, nom_destino, subtotal, total, id_cliente) VALUES(100, 3145067896, 40, 'carrera 78 # 20 c 41', 'Activo', '2021-05-12', '2009-08-23', 'Andrés', 6000, 12000, 1);
INSERT INTO encabezado_pedidos(id_pedido, cel_destino, descuento, dir_destino, estado, fecha, fecha_entrega, nom_destino, subtotal, total, id_cliente) VALUES(101, 3128949856, 12, 'carrera 78 # 20 c 41', 'Activo', '2021-08-18', '2015-04-02', 'Sebas', 10000, 20000, 2);

/*INSERT INTO encabezado_pedido (id_pedido, celular_destino, descuento, direccion_destino, estado, fecha, fecha_entrega, id_cliente, nombre_destino, subtotal, total) VALUES (100, 3145067896, 40, 'carrera 78 # 20 c 41', 'Activo', '2021-05-12', '2022-05-12', 1,'Andrés', 6000, 12000);*/
