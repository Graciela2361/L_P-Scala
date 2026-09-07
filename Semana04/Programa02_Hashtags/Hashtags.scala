/*
  Autor: Graciela Luciana Canales Palomino
  Código: U23304661
  Fecha de creación: 06/09/2026
*/

@main
def limpiarHashtags(): Unit = {

  // Se crea un conjunto de etiquetas con espacios y diferencias de mayúsculas
  val hashtags = Set(
    "Scala",
    " scala ",
    "PROGRAMACION",
    "Programacion",
    "IA",
    " tecnología ",
    "TECNOLOGIA",
    "go",
    "Java"
  )

  // MAP: se eliminan espacios y se convierten las etiquetas a minúsculas
  val hashtagsLimpios = hashtags.map(_.trim.toLowerCase)

  // FILTER: se eliminan las etiquetas con menos de 3 caracteres
  val hashtagsValidos = hashtagsLimpios.filter(_.length >= 3)

  // MKSTRING: se concatenan las etiquetas restantes separadas por comas
  val resultado = hashtagsValidos.mkString(",")

  // Se muestra el resultado final
  println("---- HASHTAGS LIMPIOS ----")
  println(resultado)
}