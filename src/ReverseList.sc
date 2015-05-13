def reverseUtility(element: List[Int], result: List[Int]): List[Int] = {
  element match {
    case Nil => Nil
    case x :: Nil => x :: result
    case x :: y => reverseUtility(y, (x :: result))
  }
}

def reverse(element: List[Int]): List[Int] = {
  reverseUtility(element, List())
}

reverse(List(1,2,3,4,5,6,7))
reverse(List())
