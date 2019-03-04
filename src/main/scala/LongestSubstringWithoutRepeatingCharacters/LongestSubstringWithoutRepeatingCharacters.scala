package LongestSubstringWithoutRepeatingCharacters

object LongestSubstringWithoutRepeatingCharacters {
  /*
  https://leetcode.com/problems/longest-substring-without-repeating-characters/
  Given a string, find the length of the longest substring without repeating characters.
   */

  def main(args: Array[String]): Unit = {
    val answer = Solution3.lengthOfLongestSubstring(args(0))
    println(answer)
  }

}
