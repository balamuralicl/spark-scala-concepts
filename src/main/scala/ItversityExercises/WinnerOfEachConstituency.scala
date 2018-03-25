package ItversityExercises

import scala.io.Source

/**
  * Created by Balus on 7/4/17.
  */
object WinnerOfEachConstituency {

  def main(args: Array[String]): Unit = {


    val fileName = "/Users/Balus/Documents/input/ls2014.tsv"


    // the below statement create the collectionof type Iterator

    val results = Source.fromFile(fileName).getLines.drop(1)

   val requiredData = results.map( rec =>
      ((rec.split("\\t")(0), rec.split("\\t")(1)),
        (rec.split("\\t")(2), rec.split("\\t")(10).toInt)))

  //  val statePartyVotes = results.map(rec => ((rec.split("\t")(0), rec.split("\t")(6)), rec.split("\t")(13).toInt))
    val groupData = requiredData.toList.groupBy(rec => rec._1)

   // groupData.take(10).foreach(println)


    val winerEachConstituency = groupData.map(rec => (rec._1 , rec._2.map(inp => (inp._2))))

    println("after mapping")

  // winerEachConstituency.take(10).foreach(println)


    val winerEachConstituency1 = winerEachConstituency.map(rec => (rec._1, rec._2.map(inp => (inp._1,inp._2)).maxBy(x => x._2)))

  //  winerEachConstituency1.take(10).foreach(println)
    //winerEachConstituency1.toList.foreach(fin =>(println("Winner of " +fin._1 +"is " +fin._2)))





  }

}
