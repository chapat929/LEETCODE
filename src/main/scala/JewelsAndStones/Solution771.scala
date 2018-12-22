package JewelsAndStones

object Solution771 {
  def numJewelsInStones(J: String, S: String): Int = {
    S.filter(a => J.contains(a)).length
  }

}
