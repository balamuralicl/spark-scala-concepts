package collections

/**
  * Created by Balus on 7/1/17.
  */
object TupleExercise {

  def main(args: Array[String]): Unit = {

    case class CardMember(cardNumber : Int, cardMemberCountry : String, cardNumberProduct : String)

    val cardMember1 = CardMember(11111,"USA","gold")
    val cardMember2 = CardMember(22222,"india","gold")
    val cardMember3 = CardMember(33333,"USA","platinum")

    val ListOfCardMembers = List(cardMember1,cardMember2,cardMember3)
//
//    val usaCardmebers , nonusaCardmember = ListOfCardMembers.partition(_.cardNumber == 11111)

    val usaCardmebers , nonusaCardmember = ListOfCardMembers.groupBy((x : CardMember) => x.cardMemberCountry == "USA")

    println("USA cardmember details " +usaCardmebers)
    println("non USA cardmember Details" +nonusaCardmember)

  }

}
