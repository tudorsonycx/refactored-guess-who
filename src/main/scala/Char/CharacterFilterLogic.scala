package Char

object CharacterFilterLogic {
  def filter(characterList: List[Character], chosenCharacter: Character, filterTrait: String, subject: Int): List[Character] = {
    val filterWithSpace: String = " " + filterTrait
    val filterList: List[Character] =
      if (chosenCharacter.describe.contains(filterWithSpace)) {
        TerminalLogic.filterMessage(subject, filterTrait, correct = true)
        characterList.filter(
          char => char.describe.contains(
            filterWithSpace
          )
        )
      } else {
        TerminalLogic.filterMessage(subject, filterTrait, correct = false)
        characterList.filterNot(
          char => char.describe.contains(
            filterWithSpace
          )
        )
      }

    filterList
  }
}
