/*
  Autor: Graciela Luciana Canales Palomino
  Código: U23304661
  Fecha de creación: 06/09/2026
*/

@main
def almacen(): Unit = {

  // Se solicita el umbral mínimo de cantidad
  print("Ingrese el umbral de reposición: ")
  val umbral = scala.io.StdIn.readInt()

  // Se ingresan las cantidades de productos del almacén
  print("Ingrese las cantidades separadas por espacios: ")
  val cantidades = scala.io.StdIn.readLine()
    .split(" ")
    .map(_.toInt)
    .toList

  // Se crea un iterador para recorrer las cantidades
  val iterador = cantidades.iterator

  println("\nProductos que requieren reposición inmediata:")

  // Se revisa cada cantidad del almacén
  while (iterador.hasNext) {
    val cantidad = iterador.next()

    // Se muestran únicamente las cantidades menores al umbral
    if (cantidad < umbral) {
      println(s"Cantidad disponible: $cantidad - Reposición inmediata")
    }
  }
}

