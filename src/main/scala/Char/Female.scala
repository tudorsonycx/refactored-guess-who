package Char

class Female(name: String, hairColour: Char.Character.HairColour, eyeColour: Char.Character.EyeColour) extends Char.Character("woman", name, hairColour, eyeColour) {
  override val describe: String = s" $name is a female. She has ${hairColour.toString.toLowerCase} hair and ${eyeColour.toString.toLowerCase} eyes."
}
