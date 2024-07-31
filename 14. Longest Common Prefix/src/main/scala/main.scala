@main
def main(): Unit = {
import Solution._
  println(longestCommonPrefix(Array("flower","flow","flight")))
}


object Solution {
 private def common_prefix(s1:String,s2:String):String ={
   val (str1, str2) = if (s2.length > s1.length) (s2, s1) else (s1, s2)

   str1.lazyZip(str2).takeWhile((ch1,ch2) => ch1 == ch2).map(_._1).mkString
  }
  def longestCommonPrefix(strs: Array[String]): String = {
    strs.reduce((x,y) => common_prefix(x,y))
  }
}