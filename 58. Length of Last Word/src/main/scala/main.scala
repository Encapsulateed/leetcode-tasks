@main
def main(): Unit = {
  import Solution._
  println(lengthOfLastWord("   fly me   to   the moon  "))
}

object Solution {
  def lengthOfLastWord(s: String): Int = {
      s.split(' ').filter(!_.contains(' ')).last.length
  }
}