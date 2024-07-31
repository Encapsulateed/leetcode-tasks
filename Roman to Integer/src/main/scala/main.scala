@main
def main(): Unit = {
  import Solution.romanToInt
  println(romanToInt("III"))
  assert(romanToInt("III") == 3)
  assert(romanToInt("LVIII") == 58)
  assert(romanToInt("MCMXCIV") == 1994)

}

object Solution {

  val map = Map[String, Int]("I" -> 1, "V" -> 5,
    "X" -> 10, "L" -> 50, "C" -> 100, "D" -> 500, "M" -> 1000,
    "IV" -> 4, "IX" -> 9, "XL" -> 40 ,"XC" -> 90,
    "CD" -> 400, "CM" -> 900)

  def romanToInt(s: String): Int = {
    var result = 0

    var idx = 0

    while (idx < s.length ) {
      val s1 = s(idx)
      val s2 =  if (idx + 1 < s.length) then s(idx + 1) else ""
      val mixed_key = s"$s1$s2"
      val key = s1.toString

      if (map.contains(mixed_key)) then {
        result += map(mixed_key)
        idx += 1
      } else {
        result += map(key)
      }
      idx += 1
    }

    result
  }
}