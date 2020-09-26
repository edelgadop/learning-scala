val url =
  "http://api.openweathermap.org/data/2.5/forecast?mode=xml&lat=55&lon=0"
val bufferedSource = io.Source.fromURL(url)
val l: List[String] = bufferedSource.getLines.toList
bufferedSource.close()

println(l.head)
