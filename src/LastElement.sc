def last(elements: List[Int]):Int= {
  elements match {
    case head :: Nil => head
    case head :: tail => last(tail)
  }
}

last(List(1,2,3,4,5,6,7))