def drop(index: Int, current: Int, element: List[Int]): List[Int] = {
  element match {
    case head :: Nil if current % index != 0 => List(head)
    case head :: tail if current % index != 0 => head :: drop(index, current + 1, tail)
    case head :: tail => drop(index, current + 1, tail)
    case _ => Nil
  }
}

def dropNthValue(indexToDrop: Int, elements: List[Int]): List[Int] = {
  drop(indexToDrop, 1, elements)
}

dropNthValue(2, List(1, 2, 3, 4, 5, 6, 7, 8))


