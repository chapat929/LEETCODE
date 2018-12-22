package JewelsAndStones

import org.scalatest.{FunSuite, Matchers}

class Solution771Test extends FunSuite with Matchers{

  test("should return zero jewels if stones are empty") {

    val result = Solution771.numJewelsInStones("abc","")

    result should be (0)
  }

  test("should return zero jewels if jewels are empty") {

    val result = Solution771.numJewelsInStones("","abcdefghijklmnopqrstuvwxyz")

    result should be (0)
  }

  test("should count individual jewels if there is one in stone string") {

    val result = Solution771.numJewelsInStones("a","abcdefghijklmnopqrstuvwxyz")

    result should be (1)
  }

  test("should count both stones even if they are of the same jewel type") {

    val result = Solution771.numJewelsInStones("a","aa")

    result should be (2)
  }

  test("should not count stones if they are not the same case as the jewel types") {

    val result = Solution771.numJewelsInStones("z","ZZ")

    result should be (0)
  }



}
