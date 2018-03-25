//package ItversityExercises
//
//import scala.io.Source
//
///**
//  * Created by Balus on 7/2/17.
//  */
//object numberofSeatsForParty1 {
//
//
//  def main(args: Array[String]): Unit = {
//
//    val fileName = "/Users/Balus/Documents/input/ls2014.tsv"
//
//
//    // the below statement create the collection of type Iterator
//
//    val results = Source.fromFile(fileName).getLines.drop(1)
//
//
//
//
//    // now lets try to get the number of votes for each party by state
//
//   // val results1 = results.
//
//   // first lets get the state, party and total votes using map
//
////    val statePartyVotes = results.map(rec => ((rec.split("\t")(0), rec.split("\t")(6)), rec.split("\t")(13).toDouble))
////
////    statePartyVotes.take(5).foreach(println)
//
//    val statePartyVotes = results.map(rec => (rec.split("\t")(0), rec.split("\t")(13).toDouble))
//
//    statePartyVotes.take(5).foreach(println)
//
//
//
//    val sample = statePartyVotes.reduce((ele,tot) => tot + ele)
//  sample.take(10).foreach(println)
//
////
////    // now we need to group by state and then internally group by party and then sum so in group use two fields
////
// //  val groupByStateAndParty = statePartyVotes.toList.groupBy(rec => (rec._1, rec._2))
////
////
////    // now lets take key i.e. state and party and from the list the number of votes so we use map
////
////  val modgroupByStateAndParty = groupByStateAndParty.map(tup => (tup._1, tup._2.map(x => x._3)))
////
////
////  modgroupByStateAndParty.take(10).foreach(println)
//// //  val result = modgroupByStateAndParty.map(rec => (rec._1, rec._2.sum))
////
//////   result.foreach(println)
//
//
//
//
//
//
//
//
//
//  }
//
//
//
//
//}
