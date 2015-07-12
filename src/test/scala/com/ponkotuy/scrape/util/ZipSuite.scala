package com.ponkotuy.util

import org.scalatest.Suite

class ZipSuite extends Suite {
  def testZip3 {
    val data = Range(3, 6).map( i => Range(0, i) )
    val result = Zip.zip3(data(0), data(1), data(2))
    result.zipWithIndex.foreach {
      case ((a, b, c), i) =>
        assert(i === a)
        assert(i === b)
        assert(i === c)
    }
    assert(result.length === 3)
  }

  def testZip6 {
    val data = Range(3, 9).map( i => Range(0, i) )
    val result = Zip.zip6(data(0), data(1), data(2), data(3), data(4), data(5))
    result.zipWithIndex.foreach {
      case ((a, b, c, d, e, f), i) =>
        assert(i === a)
        assert(i === b)
        assert(i === c)
        assert(i === d)
        assert(i === e)
        assert(i === f)
    }
    assert(result.length === 3)
  }
}
