val numbersInWords = Array("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

def fullWords(number: Int): String = {
  number match {
    case number if (number < 10) => numbersInWords(number)
    case number if (number > 9) => fullWords(number / 10) + "-" + numbersInWords(number % 10)
  }
}

fullWords(125)