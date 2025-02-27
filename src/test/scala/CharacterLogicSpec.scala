import Char.CharacterLogic
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.util.Random

class CharacterLogicSpec extends AnyWordSpec with Matchers {
  "CharacterLogic" should {
    "select correct character when getRandomNum is mocked" in {
      val mockCharLogic = new CharacterLogic {
        override def getRandomNum: Int = 5
      }

      mockCharLogic.chosenChar shouldBe mockCharLogic.characterList(5)
    }
  }
}
