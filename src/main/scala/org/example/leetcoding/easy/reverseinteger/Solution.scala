package org.example.leetcoding.easy.reverseinteger

import scala.annotation.tailrec

object Solution {
  def reverse(x: Int): Int = {

    @tailrec
    def inOut(in: Int, out: Int): Int = {
      if (in == 0) out
      else if (out > Integer.MAX_VALUE / 10 || out < Integer.MIN_VALUE / 10) return 0
      else inOut(in / 10, out * 10 + in % 10)
    }

    inOut(x, 0)
  }
}
