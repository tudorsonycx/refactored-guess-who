package Char

abstract class Character(val gender: String, val name: String, val hairColour: Character.HairColour, val eyeColour: Character.EyeColour) {
  val describe = ""
}

object Character {
  sealed trait HairColour

  case object Blonde extends HairColour

  case object Black extends HairColour

  case object Pink extends HairColour

  sealed trait EyeColour

  case object Brown extends EyeColour

  case object Hazel extends EyeColour

  case object Blue extends EyeColour

  case object Green extends EyeColour
}

