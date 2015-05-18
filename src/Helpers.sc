val ele = Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))

def print(ele:Array[Array[Int]], i:Int, j:Int): Unit ={
  if (i==3)
    println(" done ")
  if(j == 3)
    print(ele, i+1, 0)

  else {
    println(ele(i)(j))
    print(ele, i, j+1)
  }
}
print(ele, 0, 0)


