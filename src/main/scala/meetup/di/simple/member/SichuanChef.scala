package meetup.di.simple.member

import scala.concurrent.Future

class SichuanChef {

  def cooking(name: String): Future[Unit] = ???
}

object SichuanChef {
  def build: SichuanChef = new SichuanChef
}