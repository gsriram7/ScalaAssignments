def slice(start: Int, end: Int, ele: List[Int], curr: Int): List[Int] = {
  ele match {
    case Nil => Nil
    case x :: Nil if curr < start => List(x)
    case x :: y if curr == (end - 1) => List(x)
    case x :: y if curr < start => slice(start, end, y, curr + 1)
    case x :: y if curr >= start && curr < end => x :: slice(start, end, y, curr + 1)
  }
}

slice(3, 5, List(1, 2, 3, 4, 5, 6, 7), 1)


