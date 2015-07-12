package com.ponkotuy.scrape.model

import scala.collection.GenIterable

case class Train(
  name: String,
  number: String,
  typ: String,
  stops: GenIterable[Stop],
  url: String,
  special: Boolean
)
