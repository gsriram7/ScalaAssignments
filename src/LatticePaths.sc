def traverse(row: Int, col: Int, count: Int): Int = {
  if(row>2 || col>2)
    0
  if (row == 2 && col == 2) {
    println("y")
    1
  }
  else {
    if (col + 1 < 3)
      count + traverse(row + 0, col + 1, count)
    if (row + 1 < 3)
      count + traverse(row + 1, col + 0, count)
    else
      count
  }
}

traverse(0, 0, 0)