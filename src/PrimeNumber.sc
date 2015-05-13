def isPrime(number: Int, flag: Boolean, iter: Int): Boolean = {
  number match {
    case num if (iter == (num / 2)) => flag
    case num if (num % iter == 0) => false
    case num => isPrime(num, flag, iter + 1)
  }
}

def listPrimesInRange(start: Int, end: Int): List[Int] = {
  start match {
    case number if (number == end) => {
      if (isPrime(number, true, 2))
        List(number)
      else
        Nil
    }
    case number if (number <= end) => {
      if (isPrime(number, true, 2))
        number :: listPrimesInRange(number + 1, end)
      else
        listPrimesInRange(number + 1, end)
    }
  }
}

listPrimesInRange(7, 31)
listPrimesInRange(5, 100)
