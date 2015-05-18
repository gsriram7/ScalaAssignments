def sumOfMultiplesOf3or5(accumulator:Int, current: Int, limit: Int): Int = {
  if (current == limit)
      if (current % 3 == 0 && current % 5 == 0)
        current + accumulator
      else
        accumulator

  else
      if ((current % 3 == 0) || (current % 5 == 0))
        sumOfMultiplesOf3or5(current+accumulator, current + 1, limit)
      else
        sumOfMultiplesOf3or5(accumulator, current + 1, limit)


}

sumOfMultiplesOf3or5(0, 1, 10)
sumOfMultiplesOf3or5(0, 1, 1000000)






