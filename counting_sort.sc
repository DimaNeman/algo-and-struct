// !! only positive integers
// it's good when digits are not too big
// it's takes linear time.
def countingSort(array: Array[Int]): Array[Int] = {
  val countArray = new Array[Int](array.max + 1)

  for {i <- array} countArray(i) +=1

  var i = 0
  for {
    e <- 0 until countArray.length
    j <- 0 until countArray(e)
  } {
    array(i) = e
    i +=1
  }
  array
}
val testMe = Array(1,2,3,1,1,1,1,7)
countingSort(testMe).foreach(print)
