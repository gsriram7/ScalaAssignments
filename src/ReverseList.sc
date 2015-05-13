def reverseUtility(element: List[Int], result: List[Int]): List[Int] = {
  element match {
    case Nil => Nil
    case head :: Nil => head :: result
    case head :: tail => reverseUtility(tail, (head :: result))
  }
}

def reverse(element: List[Int]): List[Int] = {
  reverseUtility(element, List())
}

reverse(List(1,2,3,4,5,6,7))
reverse(List())

