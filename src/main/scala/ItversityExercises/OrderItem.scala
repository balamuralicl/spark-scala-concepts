package ItversityExercises

/**
  * Created by Balus on 6/27/17.
  */
class OrderItem (
                  var orderItemId : Int ,
                  var orderItemOrderId : Int,
                  var orderItemProductId : Int,
                  var orderItemQuantity: Int,
                  var orderItemSubtotal: Float,
                  var orderItemProductPrice: Float
                ) {

  // now lets have require function to tell it needs to have correct sub total

  require( orderItemSubtotal == orderItemQuantity * orderItemProductPrice, "Invalid order subtotal" )

  // let defina another ocnstructor which will be invoked when passed three parms

  def this(
          orderItemId : Int ,
          orderItemOrderId : Int,
          orderItemProductId : Int,
          orderItemQuantity: Int,
          orderItemProductPrice: Float
          ) = {

    //Invoking default constructor
      this(orderItemId,
        orderItemOrderId,
        orderItemProductId,
        orderItemQuantity,
        orderItemQuantity * orderItemProductPrice,
        orderItemProductPrice)
  }

  // now overide to string


  override def toString(): String = "OrderItem(" +
    orderItemId +
    "," +
    orderItemOrderId +
    "," +
    orderItemProductId +
    "," +
    orderItemQuantity +
    "," +
    orderItemSubtotal +
    "," +
    orderItemProductPrice +
    ")"

}
