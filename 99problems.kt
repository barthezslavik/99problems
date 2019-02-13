package learning 
 
fun main(args : Array<String>) { 
  val list = listOf(1, 2, 3, 4, 5)
  val last = list.last()
  println("(01) $last")

  val size = list.size
  val lastButOne = list[size-2]
  println("(02) $lastButOne")
  
  val nth = nth(2, list)
  println("(03) $nth")

  println("(04) $size")

  val rev = list.asReversed()
  println("(05) $rev")

  val plist = listOf(1, 2, 3, 2, 1)
  val pal = isPalindrome(plist)
  println("(06) $pal")

  val nested = listOf(1, listOf(5), listOf(1,3))
  val flat = mutableListOf<Any?>()
  flattenList(nested, flat)
  println("(07) $flat")
}

fun nth(n: Int, list: List<Int>) = list[n+1]

fun isPalindrome(list: List<Int>) = list == list.asReversed()

fun flattenList(nestedList: List<Any?>, flatList: MutableList<Any?>) {
  nestedList.forEach{
    e -> when(e){
      !is List<Any?> -> flatList.add(e)
      else -> flattenList(e, flatList)
    }
  }
}
