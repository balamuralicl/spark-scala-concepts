package ClassandObjects

/**
  * Created by Balus on 6/27/17.
  */
class SumOfEvenNumber {

  def sumOfEvenNumber() : Int = {

    var res = 0;

    for(e <- 2 to 100 by 2)
      {
        res = res + e

      }
    res



  }

}
