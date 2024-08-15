@main
def main(): Unit = {
  import Solution._

  assert(isPalindrome(121))
  assert(!isPalindrome(-121))
  assert(!isPalindrome(10))
}

object Solution
{
  def isPalindrome(x: Int): Boolean = {
    x.toString == x.toString.reverse
  }
}