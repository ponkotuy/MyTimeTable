package com.ponkotuy.scrape

import com.ponkotuy.scrape.model.TimeTablePage

object Main {
  // wget & XMLParse
  def scrape(url: String): TimeTablePage = {
    import scala.xml._
    import java.net.URL
    import scalax.io.JavaConverters._
    import net.liftweb.util.Html5

    implicit val codec = scalax.io.Codec("Shift_JIS")

    val str = new URL(url).asInput.string
    val xml = Html5.parse(str) openOr NodeSeq.Empty
    TimeTablePage.fromXML(xml)
  }

  def main(args: Array[String]) {
    val table = scrape("http://www.ekikara.jp/newdata/line/2301011/down1_1.htm")
    println(table.trains.map(_.url))
  }
}
