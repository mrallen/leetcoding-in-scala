package org.example.leetcoding.easy.reverseinteger

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SolutionTest extends AnyFlatSpec with Matchers {

  val objectUnderTest: Solution.type = Solution

  "reverse" should "return 321" in {
    val input = 123
    val expected = 321

    val actual = objectUnderTest.reverse(input)

    expected shouldBe actual
  }

  it should "return -321" in {
    val input = -123
    val expected = -321

    val actual = objectUnderTest.reverse(input)

    expected shouldBe actual
  }

  it should "return 21" in {
    val input = 120
    val expected = 21

    val actual = objectUnderTest.reverse(input)

    expected shouldBe actual
  }

  it should "return 0" in {
    val input = 0
    val expected = 0

    val actual = objectUnderTest.reverse(input)

    expected shouldBe actual
  }

}
