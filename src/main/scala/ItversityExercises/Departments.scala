package ItversityExercises

/**
  * Created by Balus on 6/27/17.
  */
class Departments (var depId : Int, var depName : String)
{
// we can have require method to make sure Dep is created only when we have depid and depname

  require(depId > 1  , "Invalid Dep Id" )
  require(depName.nonEmpty, "invalid dep name")

}
