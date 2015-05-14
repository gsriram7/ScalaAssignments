def latticePath(row:Int, col:Int):Long ={
  (row, col) match {
    case point if row==0 || col==0 => 1
    case point => latticePath(row-1, col) + latticePath(row, col-1)
  }
}

latticePath(2,2)





