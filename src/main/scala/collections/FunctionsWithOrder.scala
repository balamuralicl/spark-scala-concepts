package collections

/**
  * Created by Balus on 7/2/17.
  */
object FunctionsWithOrder {

  def main(args: Array[String]): Unit = {

    // let create a list with orders

    val os = List(
      Order(1, "2017-01-01", 100, "BALU"),
      Order(2, "2017-01-01", 20, "CLOSED"),
      Order(3, "2017-01-01", 301, "BALU"),
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
    )

    // to create a new list by changing the date format

     os.map( (x : Order) => x.orderDate.replace("-", "/")).foreach(println)

    // to filter completed orders

    os.filter(_.orderStatus == "COMPLETE" ).foreach(println)

    // to count the number of completed orders

    println(os.filter(_.orderStatus == "COMPLETE").size)

    // by filtering and creating into a list

    val orderCompleted = os.filter((x : Order) =>  x.orderStatus == "COMPLETE")
    println(orderCompleted)

    // i just want to sum the order id

    val sum = os.filter(_.orderStatus == "BALU").map((x : Order) => x.orderCustomerId).reduce((res, ele) => res + ele)

    println(sum)


    // lets do sort and grouping

    // to use sorted function the fields needs to be of genric class type like Int which has natural sorting ordering

    var list = List(1,2,4,6,7,3,9,-100,23,11,12,29)
    println(list.sorted)

    // to sort data like the list of order we cant use sorted function as order doesnt have the ordering defined
    // so we can use sortby or sortwith

    //sortby
    // sortby takes the parmater as a functionwhich would give result which as natural ordering

    // when used ~ would result in desecnding order else naturallys its ascending order
    println(os.sortBy((x : Order) => ~x.orderCustomerId))

    // now lets see sortwith function

    os.sortWith((x: Order , y : Order) => {
      if (x.orderCustomerId > y.orderCustomerId)
         false
      else if (x.orderCustomerId < y.orderCustomerId)
        true
      else
        if (x.orderId > y.orderId)
        false
      else if (x.orderId < y.orderId)
      true
      else
        true

    })


  // to group the data based on some condition and do the counting we can use groupby

    os.groupBy((x : Order) => x.orderStatus).map(x => x._1 + "\t" +x._2.size).foreach(println)



  }

}
