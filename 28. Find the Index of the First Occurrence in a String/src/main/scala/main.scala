@main
def main(): Unit = {
  import Solution._
  println(strStr("leetcode","leeto"))
  println(strStr("sadbutsad", "sad"))
}

object Solution {

  def strStr(haystack: String, needle: String): Int = {
    def go(idx: Int): Int = {
      idx match
        case hid if hid >= haystack.length => -1
        case hid if hid + needle.length  > haystack.length => -1
        case _ =>
          val acc = haystack.substring(idx, idx + needle.length )
          acc match
            case acum if acum == needle => idx
            case _ => go(idx + 1)

    }
    go(0)
  }
}

