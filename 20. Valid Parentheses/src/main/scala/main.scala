import scala.collection.mutable

@main
def main(): Unit = {
  import Solution._
  assert(isValid("()"))
  assert(isValid("()[]{}"))
  assert(!isValid("(]"))
  assert(isValid("([{}])"))
  assert(!isValid("(])"))
}

object Solution {

  import scala.collection.mutable.Stack

  private def isOpen(x:Char): Boolean = {
      x == '(' || x == '{' || x == '['
  }
  val closing = Map('(' -> ')','[' -> ']','{' -> '}')

  def isValid(s: String): Boolean = {
    val stack = mutable.Stack[Char]()
    var non_valid = false
    for (item <- s){
      item match
        case lb if isOpen(lb) => stack.push(lb)
        case rb if !isOpen(rb)  && stack.nonEmpty && closing(stack.top) == rb => stack.pop()
        case rb if !isOpen(rb) && stack.isEmpty => non_valid = true
        case _ => non_valid = true
    }

    !non_valid && stack.isEmpty

  }
}