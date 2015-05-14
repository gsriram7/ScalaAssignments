def latticePath(row:Int, col:Int, count:Int):Int ={
  (row,col) match {
    case point if row==2 && col==2 => count + 1
    case point if row==1 && col==1 => count + 2
    case point => {
      if(col+1 < 3)
        latticePath(row, col+1, count)
      if (row+1 < 3)
        latticePath(row+1, col, count)
      else
        count
    }
  }
}

latticePath(1, 1, 0)

