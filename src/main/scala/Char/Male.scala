package Char

class Male(name: String, hairColour: Char.Character.HairColour, eyeColour: Char.Character.EyeColour) extends Char.Character("man", name, hairColour, eyeColour) {
  override val describe: String = s" $name is a male. He has ${hairColour.toString.toLowerCase} hair and ${eyeColour.toString.toLowerCase} eyes."
}
