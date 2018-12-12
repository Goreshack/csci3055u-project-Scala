object conds {
  def main(args: Array[String]){
    // Fairly basic if/elseif/else loops are included given built on JVM
    

    // Scala has a match which can be utilized similar to a switch statement 
    // in other languages
    
    // Wherein which _ acts as a for all other cases
    for(x <- List.range(0, 10, 1)){
      x match{
        case ( x % 2 == 0) => println("Even number")
        case _ => println("Odd number")
      }
    }

    // Switch is also available in the language
    
    // Scala also supports nested loops, for->if etc
  }

}
