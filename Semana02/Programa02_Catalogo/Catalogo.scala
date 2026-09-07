/*
  Autor: Graciela Luciana Canales Palomino
  Código: U23304661
  Fecha de creación: 06/09/2026
*/

@main
def catalogo(): Unit = {

  // Se define el catálogo de productos con su respectivo precio
  val productos = Map(
    "Laptop" -> 2500.0,
    "Mouse" -> 80.0,
    "Teclado" -> 120.0,
    "Monitor" -> 900.0,
    "Audifonos" -> 150.0
  )

  // Se solicita al usuario el nombre del producto que desea buscar
  print("Ingrese el nombre del producto: ")
  val productoBuscado = scala.io.StdIn.readLine()

  // Se crea un iterador para recorrer los elementos del catálogo
  val iterador = productos.iterator
  var encontrado = false

  // Se recorren los productos hasta encontrar el solicitado o terminar el iterador
  while (iterador.hasNext && !encontrado) {
    val (producto, precio) = iterador.next()

    // Se compara el nombre ingresado con el nombre del producto
    if (producto.equalsIgnoreCase(productoBuscado)) {
      println(s"El precio de $producto es $$${precio}")
      encontrado = true
    }
  }

  // Si no se encontró el producto, se muestra el mensaje correspondiente
  if (!encontrado) {
    println("Producto no encontrado en el catálogo actual")
  }
}