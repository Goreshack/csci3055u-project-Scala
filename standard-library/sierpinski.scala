object Main extends App {
  def printSierpinski(n: Int){
    def sierpinski(n: Int): List[String] = {
      lazy val down = sierpinski(n - 1)
      lazy val space = " " * (1 << (n-1))
      n match{
        case 0 => List("*")
        case _ => (down map (space + _ + space)) :::
                  (down map (List.fill(2)(_) mkString " "))
      }
    }
    sierpinski(n) foreach println
  }

  printSierpinski(5)
}

// We'll use some basic functionality from Scala to code a Sierpinski Triangle
// and print the result into the console
