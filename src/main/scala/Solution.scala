object Solution {

  def addsToTarget(value1: Int, value2: Int, target: Int): Boolean = {
    value1 + value2 == target
  }

  def twoSum(array: Array[Int], target: Int): Array[Int] = {
    for (i <- 0 until array.length) {
      for (j <- i+1 until array.length) {
        if (array(i) + array(j) == target) {
          return Array(i,j)
        }

      }
    }
    return Array(0,1)
  }


}
