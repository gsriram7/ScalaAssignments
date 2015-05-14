def slice(start: Int, end: Int, ele: List[Int], curr: Int): List[Int] = {
  ele match {
    case Nil => Nil
    case head :: Nil if curr < start => List(head)
    case head :: tail if curr == (end - 1) => List(head)
    case head :: tail if curr < start => slice(start, end, tail, curr + 1)
    case head :: tail if curr >= start && curr < end => head :: slice(start, end, tail, curr + 1)
  }
}

slice(3, 5, List(1, 2, 3, 4, 5, 6, 7), 1)


