package collections

/**
  * Created by Balus on 7/1/17.
  */
object SetFunctions {

  def main(args: Array[String]): Unit = {


    var set1 = Set(1,2,3)
    var set2 = Set(2,4,5)

    //addition opeartions to create new set

    var set3 = set1 ++ set2
    println(set3)

    // on set also we can add to existing
    println("Before adding set1" +set1)
    set1 + (5)

    println("after add set1" +set1)

    // union operators

    println(set1)
    println(set2)
    var set4 = set1 intersect  set2
    println("union of set1 and set2 :  " +set4)

    var set5 = Set(1,2,3)
    var set6 = set5.foreach((i : Int) => i * 3)


  }


}
