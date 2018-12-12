import scala.io._
import breeze.plot._

// Andrew Dale
// 100491442

// Inspired by: https://henning.kropponline.de/2016/03/06/plotting-graphs-data-science-with-scala/

// Was going to use Vegas but no support for scala x.12

// Will plot specific csv sets typically given by
// large companies for data analysis

object Data  {
  def main(args: Array[String]) = {
    val File = "Yahoo.csv"

    // Drops header row and puts daily high and low into
    // array
    var high = Source.fromFile(File)
      .getLines.drop(1)
      .map(_.split(',')(2))
      .toList
    var low = Source.fromFile(File)
      .getLines.drop(1)
      .map(_.split(',')(3))
      .toList

  var highInt:List[Int] = List()
  var lowInt:List[Int] = List()

  // Could not for the life of me figure out how to fix
  // implicit value error
  for(i <- high) highInt = highInt :+ i(1).toInt
  for(i <- low) lowInt = lowInt :+ i(1).toInt
  for(i <- low) println(i.toString)
  val days = List.range(0, high.length, 1).map(_.toInt)

  for(i <- lowInt) println(lowInt)
  for(i <- days) println(i.toString)
  val f = Figure()
  val Plot = f.subplot(0)

  Plot.title = "Yahoo Financial Data"
  Plot.xlabel = "Days"
  Plot.ylabel = "$ Value"
  Plot += plot(days, highInt)
  Plot += plot(days, lowInt)

  f.refresh()
  }

}
