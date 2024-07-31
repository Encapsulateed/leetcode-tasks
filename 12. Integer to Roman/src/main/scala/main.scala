@main
def main(): Unit = {
  import Solution._

  println(intToRoman(58))
}

  object Solution {

    val roman_to_dec = Map(0 -> "", 1 -> 'I', 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V", 6 -> "VI", 7 -> "VII", 8 -> "VIII", 9 -> "IX", 10 -> "X",
      20 -> "XX", 30 -> "XXX", 40 -> "XL", 50 -> "L", 60 -> "LX", 70 -> "LXX", 80 -> "LXXX", 90 -> "XC",
      100 -> "C", 200 -> "CC", 300 -> "CCC", 400 -> "CD", 500 -> "D", 600 -> "DC", 700 -> "DCC", 800 -> "DCCC", 900 -> "CM")

    def intToRoman(num: Int): String = {
      val thousands = num / 1000
      val hundreds = (num % 1000) / 100
      val tens = (num % 100) / 10
      val units = num % 10
      "M" * thousands + roman_to_dec(100 * hundreds) + roman_to_dec(10 * tens) + roman_to_dec(units)
    }
  }