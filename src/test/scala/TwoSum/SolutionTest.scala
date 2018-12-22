package TwoSum

import org.scalatest.Matchers

class SolutionTest extends org.scalatest.FunSuite with Matchers {

  test("should return indices of values in an array that sum to a positive integer target") {
    val firstIndex = 0
    val firstValue = 0
    val secondIndex = 1
    val secondValue = 9

    val testArray = new Array[Int](2)
    testArray(firstIndex) = firstValue
    testArray(secondIndex) = secondValue
    val target = firstValue + secondValue
    val expectedArray = Array(firstIndex, secondIndex)

    val resultingArray = Solution.twoSum(testArray, target)

    resultingArray should equal (expectedArray)
  }

  test("should return indices of values in an array that sum to a negative integer target") {
    val firstIndex = 0
    val firstValue = 0
    val thirdIndex = 2
    val thirdValue = -5

    val testArray = new Array[Int](3)
    testArray(firstIndex) = firstValue
    testArray(thirdIndex) = thirdValue
    val target = firstValue + thirdValue
    val expectedArray = Array(firstIndex, thirdIndex)

    val resultingArray = Solution.twoSum(testArray, target)

    resultingArray should equal (expectedArray)
  }

  test("should return different indices of values in an array that sum to a target of zero") {
    val firstIndex = 0
    val firstValue = 0
    val secondIndex = 1
    val secondValue = 0

    val testArray = new Array[Int](2)
    testArray(firstIndex) = firstValue
    testArray(secondIndex) = secondValue
    val target = firstValue + secondValue
    val expectedArray = Array(firstIndex, secondIndex)

    val resultingArray = Solution.twoSum(testArray, target)

    resultingArray should equal (expectedArray)
  }

}
