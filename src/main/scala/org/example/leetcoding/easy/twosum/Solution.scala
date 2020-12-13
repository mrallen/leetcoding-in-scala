package org.example.leetcoding.easy.twosum

import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.immutable

object Solution {
//  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
//    val map = mutable.HashMap[Int, Int]()
//    for ((v, k) <- nums.zipWithIndex) {
//      val comp = target - v
//      if (map.contains(comp)) {
//        return Array(map(comp), k)
//      } else {
//        map.put(v, k)
//      }
//    }
//    throw new IllegalArgumentException("No usable value found.")
//  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = immutable.HashMap[Int, Int]()
    @tailrec
    def find(i: Int, map: immutable.HashMap[Int, Int]): Array[Int] = {
      if (i == nums.length) throw new IllegalArgumentException("No usable value found.")
      else
        map.get(target - nums(i)) match {
          case Some(v) => Array(v, i)
          case None => find(i + 1, map + (nums(i) -> i))
        }
    }

    find(0, map)

  }
}
