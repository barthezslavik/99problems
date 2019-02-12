package learning 
 
fun main(args : Array<String>) { 
  val list = listOf(1, 2, 3, 4, 5)
  val last = list.last()
  println("(01) $last")

  val size = list.size
  val last_but_one = list.get(size-2)
  println("(02) $last_but_one")
  
  val result = nth(2, list)
  println("(03) $result")
}

fun nth(n: Int, list: List<Int>):Int {
  return list.get(n+1)
}
