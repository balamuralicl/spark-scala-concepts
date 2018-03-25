package ItversityExercises

import scala.io.Source

/**
  * Created by Balus on 7/2/17.
  */
object numberofSeatsForParty {


  def main(args: Array[String]): Unit = {

    val fileName = "/Users/Balus/Documents/input/ls2014.tsv"


    // the below statement create the collectionof type Iterator

    val results = Source.fromFile(fileName).getLines.drop(1)



    val statePartyVotes = results.map(rec => ((rec.split("\t")(0), rec.split("\t")(6)), rec.split("\t")(13).toInt))


    // now we need to group by state and then internally group by party and then sum so in group use two fields

    val groupByStateAndParty = statePartyVotes.toList.groupBy(rec => (rec._1))

    val modgroupByStateAndParty = groupByStateAndParty.map(rec => (rec._1, rec._2.map(x => x._2).reduce(
                                                                    (tot, ele) => tot + ele)))

    modgroupByStateAndParty.toList.sortBy(x => x._2).foreach(rec => println(rec._1 +"\t" +rec._2))

//  val result = modgroupByStateAndParty.map(rec => (rec._1, rec._2.sum))
//
////   result.foreach(println)









  }




}
