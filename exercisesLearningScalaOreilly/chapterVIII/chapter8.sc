// Exercise 1
import java.util.Date
class Console (val make: String, val model: String, val debut_date: Date, val wifi: String = null,
              val phys_formats: List[String], val resolution: (Int, Int)) {
  override def toString: String = s"-Make: $make \n-Model: $model \n-Debut date: $debut_date " +
    s"\n-Resolution: ${resolution._1} x ${resolution._2}"
}

val ps5 = new Console(make="Sony", model="PlayStation5", debut_date=new Date(2020,12,31),
  phys_formats=List("DVD", "HDMI"),resolution=(1920,1080))

class Game(val name: String, val maker: String, val consoles: List[Console]) {
  def isSupported(console: Console) = consoles.contains(console)
}
val tlou2 = new Game("The Last Of Us: Part 2", "NaughtyDog", List(ps5))

val nsw = new Console(make="Nintendo", model="Switch", debut_date=new Date(2020,12,31),
  phys_formats=List("HDMI"),resolution=(1600,720))

tlou2.isSupported(ps5)
tlou2.isSupported(nsw)
