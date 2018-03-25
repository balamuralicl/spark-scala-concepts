package ClassandObjects

/**
  * Created by Balus on 6/27/17.
  */
class CardMember ( var CmName : String , var CmAge : Int) {

  println("this is executed as default constructor")


  // we can overdie the funtion of any parent class

  override def toString  = {

    "Cmname of the object craeted is :"  +CmName + "and the cm age is :" +CmAge

  }
}
