package com.ponkotuy.scrape

import com.ponkotuy.scrape.model.{TimeTablePage, TrainPage}

import scala.xml.NodeSeq

object Main {
  implicit val codec = scalax.io.Codec("Shift_JIS")
  // load & XMLParse
  def scrape(url: String): TimeTablePage = {
    val xml = loadXML(url)
    TimeTablePage.fromXML(xml)
  }

  def main(args: Array[String]) {
    // val table = scrape("http://www.ekikara.jp/newdata/line/2301011/down1_1.htm")
    // println(table.trains.map(_.url))
    val host = "http://www.ekikara.jp"
    val url = "/newdata/detail/2301011/36158.htm"
    val train = TrainPage.fromXML(loadXML(s"${host}${url}"), url)
    println(train)
  }

  def loadXML(url: String): NodeSeq = {
    import java.net.URL

    import net.liftweb.util.Html5

    import scala.xml._
    import scalax.io.JavaConverters._

    val str = new URL(url).asInput.string
    Html5.parse(str) openOr NodeSeq.Empty
  }
}
