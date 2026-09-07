/*
  Autor: Graciela Luciana Canales Palomino
  Código: U23304661
  Fecha de creación: 06/09/2026
*/

@main
def actualizarPrecios(): Unit = {

  // Se crea el mapa con los productos y sus precios actuales
  val productos = Map(
    "Laptop" -> 2500.0,
    "Mouse" -> 40.0,
    "Teclado" -> 120.0,
    "Monitor" -> 900.0,
    "USB" -> 30.0,
    "Audifonos" -> 150.0
  )

  // Se seleccionan únicamente los productos con precio mayor a 50
  val productosFiltrados = productos.filter { case (_, precio) =>
    precio > 50.0
  }

  // Se aplica un descuento del 20% a los productos seleccionados
  val preciosRebajados = productosFiltrados.map { case (producto, precio) =>
    (producto, precio * 0.80)
  }

  // Se transforma el resultado al formato solicitado
  val listaProductos = preciosRebajados.map { case (producto, precio) =>
    "Producto: " + producto + " | Precio Rebajado: $" + f"$precio%.2f"
  }.toList

  // Se calcula el precio promedio de los productos rebajados
  val promedio = preciosRebajados.values.sum / preciosRebajados.size

  // Se muestra la lista de productos y el precio promedio
  println("---- PRODUCTOS CON DESCUENTO ----")
  listaProductos.foreach(println)

  println("\nPrecio promedio: $" + f"$promedio%.2f")
}