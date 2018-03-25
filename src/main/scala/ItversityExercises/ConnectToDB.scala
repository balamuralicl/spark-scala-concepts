package ItversityExercises

import java.sql.DriverManager

import com.typesafe.config.ConfigFactory

/**
  * Created by Balus on 7/1/17.
  */
object ConnectToDB {


  def main(args: Array[String]): Unit = {

    val conf = ConfigFactory.load()
    val props = conf.getConfig("dev")

    val driver = "com.mysql.jdbc.Driver"
    val host = props.getString("host")
    val port = "3306"
    val db = "hr"
    val user = "hr_ro"
    val password = "itversity"
    val url = "jdbc:mysql://" +host +":"  +port +"/" +db

    val sql = "select first_name, last_name, salary, commission_pct from employees"




    // resgister the driver class

    Class.forName(driver)

    // get the connection use driver manager

    val connection = DriverManager.getConnection(url,user,password)

    // prepare the statement

    val statment = connection.createStatement()

    //now execute statment which return result set
    val resultSet = statment.executeQuery(sql)

    // process in

    Iterator.
      continually((resultSet.next(), resultSet)).
      takeWhile(_._1).
      map(r => {
        EmployeeCommission(
          r._2.getString("first_name"),
          r._2.getString("last_name"),
          r._2.getDouble("salary"),
          r._2.getDouble("commission_pct")
        )
      }).
      toList.
      foreach(println)



 //conventional way of getting the details from result set
    while ( resultSet.next())
      {
        val e = EmployeeCommission(resultSet.getString("first_name"), resultSet.getString("last_name"),
          resultSet.getDouble("salary"), resultSet.getDouble("commission_pct"))


      println(e.toGetCommisionPct())

      }








  }

}
