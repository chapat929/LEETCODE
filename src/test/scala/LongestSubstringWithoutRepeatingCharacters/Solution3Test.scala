package LongestSubstringWithoutRepeatingCharacters

import org.scalatest.FunSuite

class Solution3Test extends FunSuite {

  test("should return 3 for \"abcabcbb\"") {
    val testString = "abcabcbb"
    val longestSubstringInTestString = "abc"

    val answer = Solution3.lengthOfLongestSubstring(testString)

    val expected = longestSubstringInTestString.length
    assert(answer == expected)
  }

  test("should return 1 for \"bbbbb\"") {
    val testString = "bbbbb"
    val longestSubstring = "b"

    val answer = Solution3.lengthOfLongestSubstring(testString)

    val expected = longestSubstring.length
    assert(answer == expected)
  }

  test("should return 3 for \"wke\" as the longest substring of \"pwwkew\"") {
    val testString = "pwwkew"
    val longestSubstring = "wke"

    val answer = Solution3.lengthOfLongestSubstring(testString)

    val expected = longestSubstring.length
    assert(answer == expected)
  }

  test("should return 1 for \" \"") {
    val testString = " "
    val longestSubstring = " "

    val answer = Solution3.lengthOfLongestSubstring(testString)

    val expected = longestSubstring.length
    assert(answer == expected)
  }

  test("should return 3 for \"dvdf\"") {
    val testString = "dvdf"
    val longestSubstring = "vdf"

    val answer = Solution3.lengthOfLongestSubstring(testString)

    val expected = longestSubstring.length
    assert(answer == expected)
  }
}
