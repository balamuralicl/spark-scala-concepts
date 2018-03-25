package ItversityExercises

/**
  * Created by Balus on 6/27/17.
  */
object ExecricseMainObject {

  def main( args : Array[String]) : Unit ={

    var dep = new Departments(2, "HR")
    println("successfully created the first object")
    var dep2 = new Departments(3, "IT")
    println("successfully created the second object")

    var cat = new Categories(1, 100, "balau")
    println(cat)

    var orderItem = new OrderItem(1, 10, 22, 2, 20, 10)
    println(orderItem)

  }

}
