package TwoSum

object TwoSum {
  /* This problem is from Leetcode
  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

  You may assume that each input would have exactly one solution, and you may not use the same element twice.

  You are given an object named Solution with a method named twoSum.
  Example:

  Given nums = [2, 7, 11, 15], target = 9,
  Because nums[0] + nums[1] = 2 + 7 = 9,
  return [0, 1].

   */
  def main(args: Array[String]): Unit = {
    val array = Array(2, 7, 11, 14)
    val target = 9

    val ints = Solution.twoSum(array, target)

    ints.iterator.foreach(a => println(a))

    print("End of Main")
  }

}

