@main
def main(): Unit = {
  import Solution._
  assert(twoSum(Array(2, 7, 11, 15), 9) sameElements Array(0, 1))
}

object Solution {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    // map<int,int> : nums(i) => index
    var map = Map[Int, Int]()
    var out = Array.emptyIntArray

    for (i <- nums.indices) {
      val diff = target - nums(i) // == nums(j)

      if map.keys.exists(_ == diff) then {
        out = Array(map(diff), i)
      }
      else {
        map += (nums(i) -> i)
      }
    }
    out
  }

}