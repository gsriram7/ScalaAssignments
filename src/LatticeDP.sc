def latticePathWithDPV2(gridSize: Int, grid: Array[Array[BigInt]]):BigInt ={
  (1 to gridSize).foreach(i=>{
    (1 to gridSize).foreach(j=>
      grid(i)(j) = grid(i-1)(j) + grid(i)(j-1)
    )
  })
  grid(gridSize)(gridSize)
}

def latticePath(size:Int): BigInt ={
  val grid = Array.ofDim[BigInt](size+1, size+1)
  (0 to size).foreach(i=>{
    grid(i)(0) = 1
    grid(0)(i) = 1
  }
  )
  latticePathWithDPV2(size, grid)
}

latticePath(20)