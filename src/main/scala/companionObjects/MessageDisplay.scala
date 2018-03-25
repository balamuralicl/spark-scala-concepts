package companionObjects

/**
  * Created by Balus on 6/27/17.
  */
class MessageDisplay( private val message :String) {



}

object MessageDisplay {

  def main(args: Array[String]): Unit = {

    var obj = new MessageDisplay("balu")
    println(obj.message)

  }

}
