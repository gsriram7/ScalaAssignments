def compressUtility(current: Int, element: List[Int]): List[Int] = {
  element match {
    case Nil => Nil
    case head :: Nil => {
      if (head != current)
        List(head)
      else
        Nil
    }
    case head :: tail => {
      if (head != current)
        head :: compressUtility(head, tail)
      else
        compressUtility(head, tail)
    }
  }
}

def compress(elements: List[Int]): List[Int] = {
  elements match {
    case Nil => Nil
    case head :: tail => head :: compressUtility(head, tail)
  }
}

compress(List(1, 1, 2, 2, 3, 4, 5, 1, 1, 6, 7, 7))
compress(List())
