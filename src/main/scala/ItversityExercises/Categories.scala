package ItversityExercises

/**
  * Created by Balus on 6/27/17.
  */
class Categories (var categoryId: Int , var categoryDepartmentId: Int, var categoryName: String) {

  // over the to string function

  override def toString()  ={

    "Category(" +categoryId + "," + categoryDepartmentId + "," +categoryName +")"


  }

}
