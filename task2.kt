enum class Color {
     RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}


fun m(c:Color):String {
    var a:String = ""
    when (c.name) {
        "RED" -> a = "Richard"
        "ORANGE"-> a = "Of"
        "YELLOW" -> a = "York"
        "GREEN"-> a = "Gave"
        "BLUE" -> a = "Battle"
        "INDIGO"-> a =  "In"
        "VIOLET" -> a = "Vain"
        }
    return a
}

/*
(RED, YELLOW) ->  ORANGE
(YELLOW, BLUE) -> GREEN
(BLUE, VIOLET) -> INDIGO
*/

fun p(a:Color, b:Color) {
    val orange = hashSetOf("RED","YELLOW")
    val green = hashSetOf("YELLOW", "BLUE")
    val indigo = hashSetOf("BLUE","VIOLET")
    if (a.name in orange  && b.name in orange) {println (Color.ORANGE.name) }
    else if (a.name in green && b.name in green) {println (Color.GREEN.name)}  
    else if (a.name in indigo && b.name in indigo) {println (Color.INDIGO.name)}
    else println("It is impossible to mix colors")
    }

fun main(args: Array<String>) {
   
   try {
        for (item in args) println(m(Color.valueOf(item.toUpperCase())))
    } catch (e: IllegalArgumentException) {
        println("There is no such color in the rainbow, choose one of the following: red, orange, yellow, green, blue, indigo or violet")
    }  
    
    p(Color.YELLOW,Color.BLUE)
    p(Color.RED,Color.GREEN)
    
}