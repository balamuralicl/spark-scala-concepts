package ItversityExercises

import scala.io.Source

/**
  * Created by Balus on 7/2/17.
  */
object ElectionResults {

  def main(args: Array[String]): Unit = {


    val fileName = "/Users/Balus/Documents/input/ls2014.tsv"


    // the below statement create the collectionof type Iterator

    val results = Source.fromFile(fileName).getLines
//     results.foreach(println)

//    results.take(100).foreach(println)


    // to get the number of "None of the Above" in each state

    // lets filter out all the records with none of the above

     val nota = results.filter(record => record.split("\t")(2) == "None of the Above")
//    nota.take(10).foreach(println)
    // println(nota.size)

    val notaByState = nota.map((record : String) => (record.split("\t")(0), record.split("\t")(10).toInt))

    //notaByState.take(2).foreach(println)

    val notaByGroup = notaByState.toList.groupBy(rec => rec._1)
    val sumOfNota = notaByGroup.map(rec => (rec._1 , rec._2.map(x => x._2).sum))

    //println(sumOfNota)

    //now of sumOfNota is map

    sumOfNota.toList.sortBy(rec => rec._2).foreach(rec => println(rec._1 +"\t" +rec._2))







//
//    val notabyState = nota.map(rec => (rec.split("/t")(0), rec.split("/t")(10).toInt)).








  }

}
