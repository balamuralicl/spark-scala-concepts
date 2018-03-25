package ItversityExercises
import scala.io.Source

/**
  * Created by Balus on 7/2/17.
  */
object NumberOfConstByState {

  def main(args: Array[String]): Unit = {

    // to read the file
    val file = "/Users/Balus/Documents/input/ls2014.tsv"
    val lines = Source.fromFile(file).getLines

    // now to get the const of each state, so we just need state and const from input so lets use map to transform

    val stateAndConstituency = lines.map(rec => (rec.split("\t")(0), rec.split("\t")(1))).toSet

    //stateAndConstituency.foreach(println)

    //now we need to group by state and as state and is map we wil convert to list and we have tuple so ._1

    val groupByState = stateAndConstituency.toList .groupBy(rec => rec._1)


    // nowe have like (Tripura,List((Tripura,Tripura West), (Tripura,Tripura West), (Tripura,Tripura West),

    // groupByState.take(10).foreach(println)

    //now after group we just need state name and number of con so use map to get them and size to get count

    val countofConst = groupByState.map(rec => (rec._1 , rec._2.map(x => x._2).size))

   // countofConst.foreach(println)

    // now the above need to be sorted in decending order by number of const

    val finalResults = countofConst.toList.sortBy(x => ~(x._2))


    finalResults.foreach(println)



  }

}
