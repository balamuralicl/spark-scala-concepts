package ItversityExercises

/**
  * Created by Balus on 7/1/17.
  */
case class EmployeeCommission(firstName : String, lastName : String,
                              salary : Double , commisionPct : Double) {

  override def toString: String = {
    "Firt Name is :" +firstName + "Last Name is :" +lastName +"salary is :" +salary +"commission is :" +commisionPct
  }

  def toGetCommisionPct() : Double = {

   if (commisionPct == 0.0) {
     0.0
   }else
   salary * commisionPct
  }


}
