package ItversityExercises

import scala.io.Source

/**
  * Created by Balus on 7/3/17.
  */
object PercentageOfPulledVotes {

  def main(args: Array[String]): Unit = {


    val fileName = "/Users/Balus/Documents/input/ls2014.tsv"


    // the below statement create the collectionof type Iterator

    val results = Source.fromFile(fileName).getLines.drop(1)

    val mapVotesForEachParty = results.map( rec => (rec.split("\t")(6), rec.split("/t")(10).toInt , rec.split("\t")(13).toInt))

    mapVotesForEachParty.take(10).foreach(println)



  }

}
