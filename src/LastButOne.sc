def lastButOneElement(elements: List[Int]):Int ={
  elements match {
    case head :: tail :: Nil => head
    case head :: body => lastButOneElement(body)
  }
}

lastButOneElement(List(1,2,3,4,5,6,7,8))
