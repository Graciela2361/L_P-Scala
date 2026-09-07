/*
  Autor: Graciela Luciana Canales Palomino
  Código: U23304661
  Fecha de creación: 06/09/2026
*/

// Se define la clase Libro con sus atributos
case class Libro(titulo: String, autor: String, paginas: Int)

@main
def lecturasRapidas(): Unit = {

  // Se crea la lista de libros
  val libros = List(
    Libro("El Principito", "Antoine de Saint-Exupéry", 96),
    Libro("Cien años de soledad", "Gabriel García Márquez", 417),
    Libro("La Metamorfosis", "Franz Kafka", 128),
    Libro("El Alquimista", "Paulo Coelho", 192),
    Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863)
  )

  // FILTER: se seleccionan los libros con menos de 200 páginas
  val lecturasCortas = libros.filter(_.paginas < 200)

  // MAP: se obtienen únicamente los títulos y se convierten a mayúsculas
  val titulosMayusculas = lecturasCortas.map(_.titulo.toUpperCase)

  // MAP: se agrega el prefijo solicitado a cada título
  val titulosProcesados = titulosMayusculas.map(titulo =>
    s"LECTURA CORTA: $titulo"
  )

  // MAP + SUM: se obtiene el total de caracteres de los títulos procesados
  val totalCaracteres = titulosProcesados.map(_.length).sum

  // Se muestra el reporte final
  println("---- REPORTE DE LECTURAS RÁPIDAS ----")

  // FOREACH: se muestra cada título procesado
  titulosProcesados.foreach(println)

  println(s"\nTotal de caracteres procesados: $totalCaracteres")
}