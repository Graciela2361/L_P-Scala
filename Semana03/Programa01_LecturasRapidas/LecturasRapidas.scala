/*
  Autor: Graciela Luciana Canales Palomino
  Código: U23304661
  Fecha de creación: 06/09/2026
*/

// Se define la clase Libro con sus atributos principales
case class Libro(titulo: String, autor: String, paginas: Int)

@main
def lecturasRapidas(): Unit = {

  // Se crea una lista de libros
  val libros = List(
    Libro("El Principito", "Antoine de Saint-Exupéry", 96),
    Libro("Cien años de soledad", "Gabriel García Márquez", 417),
    Libro("La Metamorfosis", "Franz Kafka", 128),
    Libro("El Alquimista", "Paulo Coelho", 192),
    Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863)
  )

  // Se filtran los libros que tienen menos de 200 páginas
  val lecturasCortas = libros.filter(_.paginas < 200)

  // Se obtienen los títulos, se convierten a mayúsculas y se agrega el prefijo
  val titulosProcesados = lecturasCortas
    .map(libro => s"LECTURA CORTA: ${libro.titulo.toUpperCase}")

  // Se calcula el total de caracteres de todos los títulos procesados
  val totalCaracteres = titulosProcesados.map(_.length).sum

  // Se muestra el reporte de Lecturas Rápidas
  println("---- REPORTE DE LECTURAS RÁPIDAS ----")

  titulosProcesados.foreach(println)

  println(s"\nTotal de caracteres procesados: $totalCaracteres")
}
