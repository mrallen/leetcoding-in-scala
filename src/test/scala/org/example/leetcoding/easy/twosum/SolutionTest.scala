package org.example.leetcoding.easy.twosum

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class SolutionTest extends AnyFlatSpec with Matchers {

  val objectUnderTest: Solution.type = Solution

  "twoSum" should "return (0, 1) with the passed data" in {
    val nums = Array( 2, 7, 11, 15 )
    val target = 9
    val expected = Array( 0, 1)

    val actual = objectUnderTest.twoSum(nums, target)

    actual should be (expected)
  }

  it should "return (1,2) with the passed data" in {
    val nums = Array( 3, 2, 4 )
    val target = 6
    val expected = Array( 1, 2)

    val actual = objectUnderTest.twoSum(nums, target)

    actual should be (expected)
  }

}
