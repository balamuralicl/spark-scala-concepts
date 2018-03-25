package ItversityExercises

import scala.io.Source

/**
  * Created by Balus on 7/2/17.
  */
object ListOfDistinctconstituency {


  def main(args: Array[String]): Unit = {

    val fileName = "/Users/Balus/Documents/input/ls2014.tsv"


    // the below statement create the collectionof type Iterator

    val results = Source.fromFile(fileName).getLines
    //     results.foreach(println)

    //    results.take(100).foreach(println)


    // to get list of distinct constituency

    val distinctconstituency = results.map(rec => rec.split("\t")(1)).toList.sorted.toSet.foreach(println)







  }
}
