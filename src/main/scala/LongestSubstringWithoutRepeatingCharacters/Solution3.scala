package LongestSubstringWithoutRepeatingCharacters

object Solution3 {
  def lengthOfLongestSubstring(s: String): Int = {
    var maxSubstringLength = 0
    var candidateSubstring = ""

    for (character <- s) {
      if (hasRepeatedCharacter(candidateSubstring, character)) {
       candidateSubstring = updateCandidateSubstring(character, candidateSubstring)
      }
      candidateSubstring = candidateSubstring + character
      maxSubstringLength = Math.max(maxSubstringLength, candidateSubstring.length)
    }

    maxSubstringLength
  }

  private def hasRepeatedCharacter(str: String, character: Char): Boolean = {
    str.contains(character)
  }

  private def updateCandidateSubstring(character: Char, str: String): String = {
    str.substring(str.indexOf(character) + 1)
  }
}
