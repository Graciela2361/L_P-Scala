/*
  Autor: Graciela Luciana Canales Palomino
  Código: U23304661
  Fecha de creación: 03/09/2026
*/

@main
def temperaturas(): Unit = {

  // Se ingresan los valores mínimo y máximo del rango seguro
  print("Ingrese el valor mínimo de temperatura: ")
  val minimo = scala.io.StdIn.readInt()

  print("Ingrese el valor máximo de temperatura: ")
  val maximo = scala.io.StdIn.readInt()

  // Se leen las temperaturas y se almacenan en una lista
  print("Ingrese las temperaturas separadas por espacios: ")
  val temperaturas = scala.io.StdIn.readLine()
    .split(" ")
    .map(_.toInt)
    .toList

  // Se crea un iterador para recorrer la lista de temperaturas
  val iterador = temperaturas.iterator
  var fueraDeRango = false

  println("\nTemperaturas fuera del rango seguro:")

  // Se revisa cada temperatura hasta terminar el iterador
  while (iterador.hasNext) {
    val temperatura = iterador.next()

    // Se identifica si la temperatura está fuera del rango permitido
    if (temperatura < minimo || temperatura > maximo) {
      println(s"$temperatura°C")
      fueraDeRango = true
    }
  }

  // Se muestra la alerta si se encontró alguna temperatura fuera de rango
  if (fueraDeRango) {
    println("\nAlerta de estabilidad")
  }
}


