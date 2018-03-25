package collections

/**
  * Created by Balus on 7/1/17.
  */
object MapFunctions {

  def main(args: Array[String]): Unit = {

  var map1 = Map(("A", 1) , ("B", 2) , ("C", 3))

    println(map1.get("A").toString)

    println(map1.getOrElse("D","balu").toString)

    println(map1.keysIterator)

    var map3 = collection.mutable.Map((1,"Hi") , (2,"Hello") , (3,"World"))


    println(map3)
    map3.getOrElseUpdate(4, "from balu")
    println(map3)

//    var map2 = Map(map1.transform((i: String , j : Int) => (i.concat("d"),j))
//    println(map2)

  }

}
