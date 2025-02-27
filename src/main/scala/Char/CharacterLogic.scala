package Char

import scala.util.Random

object CharacterLogic {
  val al = new Male("Al", Char.Character.Pink, Char.Character.Blue)
  val april: Female = new Female("April", Char.Character.Black, Char.Character.Brown)
  val lan = new Female("Lan", Char.Character.Pink, Char.Character.Green)
  val farnoosh = new Female("Farnoosh", Char.Character.Pink, Char.Character.Blue)
  val eloise = new Female("Eloise", Char.Character.Black, Char.Character.Green)
  val nimo = new Female("Nimo", Char.Character.Blonde, Char.Character.Hazel)
  val dorothea = new Female("Dorothea", Char.Character.Blonde, Char.Character.Blue)
  val sandra = new Female("Sandra", Char.Character.Pink, Char.Character.Hazel)
  val ash = new Male("Ash", Char.Character.Pink, Char.Character.Hazel)
  val tudor = new Male("Tudor", Char.Character.Blonde, Char.Character.Hazel)
  val waris = new Male("Waris", Char.Character.Black, Char.Character.Blue)
  val andy = new Male("Andy", Char.Character.Black, Char.Character.Green)
  val characterList: List[Char.Character] = List(al, april, lan, farnoosh, eloise, nimo, dorothea, sandra, ash, tudor, waris, andy)

  val randomnum: Int = Random.between(0, characterList.length - 1)
  //println(randomnum)
  val chosenChar: Char.Character = characterList(randomnum)
  //println(chosenChar.name)

  val boardX: Int = 4
  val boardY: Int = 3

  def startBoardAsRow(x: Int, y: Int): List[String] = (for {
    num: Int <- 1 to x * y
  } yield "\u001b[34m-O-\u001b[0m").mkString.grouped(12 * x).toList

  def printStartBoard(x: Int, y: Int): Unit = for {
    numY: Int <- 0 until y
  } println(startBoardAsRow(x, y)(numY))

  //methods so that we can print the start board (size x by y) where all characters are "flipped up"

  //  printStartBoard(5, 4) //prints example of this

  //  val filteredCharList: List[Char.Character] = fullCharList.filter(char => char.hairColour == Char.Character.Pink)

  //  println(fullCharList.map(char => char.describe))

  //an example list of filtered characters and their descriptions

  def boardAsRow(x: Int, y: Int, fullList: List[Char.Character], filteredList: List[Char.Character]): List[String] = (for {
    num: Int <- 0 to x * y - 1
    piece: String = if (filteredList.contains(fullList(num))) {
      "\u001b[34m-O-\u001b[0m"
    } else {
      "\u001b[31m-X-\u001b[0m"
    }
  } yield piece).mkString.grouped(12 * x).toList

  def printBoard(x: Int, y: Int, fullList: List[Char.Character], filteredList: List[Char.Character]): Unit = for {
    numY: Int <- 0 to y - 1
  } println(boardAsRow(x, y, fullList, filteredList)(numY))

  //  printBoard(boardX, boardY, fullCharList, filteredCharList)

  // methods to compare the full list of characters, with the remaining possibilities for the computer's character. It then prints what the board will look like after this go.

  //  println(filteredCharList.map((char: Char.Character) => char.describe).mkString("\n"))

  // prints a description of each of the remaining characters
}
