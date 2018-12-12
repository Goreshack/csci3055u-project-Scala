object IO {
  def main(args: Array[String]){
    println("Enter a number! ")
    val str = scala.io.StdIn.readLine()
    
    if(str.toInt % 2 == 0){
      println("Number is even")
    }else{
      println("Number is odd")
    }
  
  }
}
