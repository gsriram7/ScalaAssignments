def sumOfMultiplesOf3or5(current: Int, limit: Int): Int = {
  current match {
    case current if (current == limit) =>
      if (current % 3 == 0 && current % 5 == 0)
        current
      else
        0

    case current if (current < limit) =>
      if ((current % 3 == 0) || (current % 5 == 0))
        current + sumOfMultiplesOf3or5(current + 1, limit)
      else
        sumOfMultiplesOf3or5(current + 1, limit)

  }
}

sumOfMultiplesOf3or5(1, 10)

