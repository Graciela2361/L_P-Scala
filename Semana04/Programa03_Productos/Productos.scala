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

  // FILTER: se conservan los productos cuyo precio sea mayor a 50
  val productosFiltrados = productos.filter { case (_, precio) =>
    precio > 50.0
  }

  // MAP: se aplica un descuento del 20% a los productos seleccionados
  val productosRebajados = productosFiltrados.map { case (producto, precio) =>
    (producto, precio * 0.80)
  }

  // MAP: se transforma el resultado en una lista de Strings
  // con el formato solicitado
  val listaProductos = productosRebajados.map { case (producto, precio) =>
    "Producto: " + producto + " | Precio Rebajado: $" + f"$precio%.2f"
  }.toList

  // Se obtiene el precio promedio de los productos rebajados
  val promedio = productosRebajados.values.sum / productosRebajados.size

  // Se muestra la lista de productos actualizados
  println("---- PRODUCTOS CON DESCUENTO ----")

  // FOREACH: se muestra cada producto de la lista
  listaProductos.foreach(println)

  println("\nPrecio promedio: $" + f"$promedio%.2f")
}