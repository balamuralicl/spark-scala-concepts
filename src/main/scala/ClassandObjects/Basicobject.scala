package ClassandObjects

/**
  * Created by Balus on 6/26/17.
  */
object Basicobject {

  def main(args:Array[String]): Unit = {
    println("hell world from basic object")



    //let define the object for card mmeber class

    var cardMember = new CardMember("balu", 28)

    //now lets print the object

    println(cardMember)

    println("cm name is " +cardMember.CmName)
  }



}
