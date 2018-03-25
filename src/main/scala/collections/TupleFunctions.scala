package collections

/**
  * Created by Balus on 7/1/17.
  */
object TupleFunctions {

  def main(args: Array[String]): Unit = {



  // this a tuple. A tuple is a special collection in scala

    var tuple1 = ((1,"A"),(2,"B"),(3,"C"),(4,"D"))

    //a tuple can be contain set of list and vice vers

    var tuple2 = ((1,List("Hi","World","from", "scala")), (2,List("Hi","world","from","java")))

    println(tuple1)
    println(tuple2)

    // some function in tuples

    // we use tuple._1 to retervice the first elemet in tuple

    println(tuple1._1)


    // now lets created a tuple which will have list of int and set of orders

    //first create orders set

    val OrderSet1 = Set(Order(1, "2017-01-01", 100, "COMPLETE"),
                       Order(2, "2017-01-01", 20, "CLOSED"),
                       Order(3, "2017-01-01", 301, "PENDING"),
                      Order(4, "2017-01-01", 202, "CLOSED"),
      Order(5, "2017-01-01", 3013, "COMPLETE"),
      Order(6, "2017-01-01", 203, "PENDING"),
      Order(7, "2017-01-01", 3014, "COMPLETE"),
      Order(8, "2017-01-01", 20, "NEW"),
      Order(9, "2017-01-01", 301, "PENDING"),
      Order(10, "2017-01-01", 2, "CLOSED"),
      Order(11, "2017-01-01", 1, "COMPLETE"),
      Order(12, "2017-01-01", 3, "NEW"),
      Order(13, "2017-01-01", 301, "COMPLETE"))

    val OrderSet2 = Set(Order(1, "2017-01-01", 100, "COMPLETE"),
      Order(2, "2017-01-01", 20, "CLOSED"),
      Order(3, "2017-01-01", 301, "PENDING"),
      Order(4, "2017-01-01", 202, "CLOSED"),
      Order(5, "2017-01-01", 3013, "COMPLETE"),
      Order(6, "2017-01-01", 203, "PENDING"),
      Order(7, "2017-01-01", 3014, "COMPLETE"),
      Order(8, "2017-01-01", 20, "NEW"),
      Order(9, "2017-01-01", 301, "PENDING"),
      Order(10, "2017-01-01", 2, "CLOSED"),
      Order(11, "2017-01-01", 1, "COMPLETE"),
      Order(12, "2017-01-01", 3, "NEW"),
      Order(13, "2017-01-01", 301, "COMPLETE"))

    //now lets create two list with this sets

    val listOrder1 = List(1, OrderSet1)
    val listOrder2 = List(2, OrderSet2)

    // now if  need to process all the list of order we can create a tuple

    val orderTuples = (listOrder1, listOrder2)

    // to access the element we use _1
    println(orderTuples._1)
    println(orderTuples._2)

    val t = List((1, Set(
      Order(1, "2017-01-01", 100, "COMPLETE"),
      Order(2, "2017-01-01", 20, "CLOSED"),
      Order(3, "2017-01-01", 301, "PENDING"),
      Order(4, "2017-01-01", 202, "CLOSED"),
      Order(5, "2017-01-01", 3013, "COMPLETE"),
      Order(6, "2017-01-01", 203, "PENDING"),
      Order(7, "2017-01-01", 3014, "COMPLETE"),
      Order(8, "2017-01-01", 20, "NEW"),
      Order(9, "2017-01-01", 301, "PENDING"),
      Order(10, "2017-01-01", 2, "CLOSED"),
      Order(11, "2017-01-01", 1, "COMPLETE"),
      Order(12, "2017-01-01", 3, "NEW"),
      Order(13, "2017-01-01", 301, "COMPLETE")
    )),
      (2, Set(
        Order(1, "2017-01-01", 100, "COMPLETE"),
        Order(2, "2017-01-01", 20, "CLOSED"),
        Order(3, "2017-01-01", 301, "PENDING"),
        Order(4, "2017-01-01", 202, "CLOSED"),
        Order(5, "2017-01-01", 3013, "COMPLETE"),
        Order(6, "2017-01-01", 203, "PENDING"),
        Order(7, "2017-01-01", 3014, "COMPLETE"),
        Order(8, "2017-01-01", 20, "NEW"),
        Order(9, "2017-01-01", 301, "PENDING"),
        Order(10, "2017-01-01", 2, "CLOSED"),
        Order(11, "2017-01-01", 1, "COMPLETE"),
        Order(12, "2017-01-01", 3, "NEW"),
        Order(13, "2017-01-01", 301, "COMPLETE")
      )))


    // to get min of orderid

    t.map(rec => (rec._1 , rec._2.minBy(order => order.orderId))).foreach(println)

   // to filter completed orders

    t.map(rec => (rec._2.filter(order => order.orderStatus == "COMPLETE"))).foreach(println)



  }

}
