def isPrime(number: Int, flag: Boolean, iter: Int): Boolean = {
  if (iter == (number / 2)) flag
  else if (number % iter == 0) false
  else isPrime(number, flag, iter + 1)
}

def listPrimesInRange(start: Int, end: Int): List[Int] = {
  if (start == end) {
      if (isPrime(start, true, 2))
        List(start)
      else
        Nil
    }
  else
      if (isPrime(start, true, 2))
        start :: listPrimesInRange(start + 1, end)
      else
        listPrimesInRange(start + 1, end)
    
}

listPrimesInRange(7, 31)
listPrimesInRange(5, 100)
