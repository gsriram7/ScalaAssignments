val numbersInWords = Array("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

def fullWords(number: Int): String = {
  if (number < 10) numbersInWords(number)
  else fullWords(number / 10) + "-" + numbersInWords(number % 10)

}

fullWords(1234567)