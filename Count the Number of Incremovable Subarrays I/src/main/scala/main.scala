@main
def main(): Unit = {
  import Solution._
  /*
      TODO
      1. Реализовать функцию проверки на строе возрастание последовательности
      2. Решать можно методом увеличивающегося окна то есть сначала ищем все неустранимые подмассивы
          длинны 1, затоем 2 ... n
     */

  assert(incremovableSubarrayCount(Array(1, 2, 3, 4)) == 10)
  assert(incremovableSubarrayCount(Array(6, 5, 7, 8)) == 7)
  assert(incremovableSubarrayCount(Array(8, 7, 6, 6)) == 3)

}

object Solution {
  def checkIncrease(arr: Array[Int]): Boolean = {
    arr match
      case Array(x) => true
      case Array.emptyIntArray => true
      case _ => arr.sliding(2).forall { case Array(x, y) => x < y }

  }

  def incremovableSubarrayCount(nums: Array[Int]): Int = {
    var counter = 0
    for (left <- nums.indices) {
      for(right <- left + 1 to nums.length){
        val current_sub_arr = nums.take(left) ++ nums.drop(right)
        if checkIncrease(current_sub_arr) then
          counter += 1
        else {

        }
      }
    }
    counter
  }

}