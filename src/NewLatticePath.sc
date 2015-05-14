val maxRows = 2
val maxCols = 2

def latticePathAttempt2(row: Int, col: Int, count: Int): Int = {
  if (row == maxRows && col == maxCols){
    count + 1
  }else if (row >= maxRows){
    latticePathAttempt2(row, col+1, count)
  }else if(col >= maxCols){
    latticePathAttempt2(row+1, col, count)
  }else{
    latticePathAttempt2(row + 1, col, latticePathAttempt2(row, col + 1, count))
  }

}
latticePathAttempt2(0, 0, 0)
