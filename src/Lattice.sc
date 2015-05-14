def factorial(accumulator:BigInt, number:Int) : BigInt = {
  number match {
    case 1 => accumulator
    case x => factorial(accumulator*number, number-1)
  }
}

def latticePath(down:Int, right:Int):BigInt ={
  factorial(1, down+right)/(factorial(1, down).pow(2))
}

latticePath(20, 20)




