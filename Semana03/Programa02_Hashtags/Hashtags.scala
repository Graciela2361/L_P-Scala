/*
  Autor: Graciela Luciana Canales Palomino
  Código: U23304661
  Fecha de creación: 06/09/2026
*/

@main
def limpiarHashtags(): Unit = {

  // Se crea un conjunto de hashtags con espacios y mayúsculas
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

  // Se eliminan espacios y se convierten las etiquetas a minúsculas
  val hashtagsLimpios = hashtags
    .map(_.trim.toLowerCase)
    .filter(_.length >= 3)

  // Se unen las etiquetas restantes separándolas por comas
  val resultado = hashtagsLimpios.mkString(", ")

  // Se muestra el conjunto limpio
  println("---- HASHTAGS LIMPIOS ----")
  println(resultado)
}

