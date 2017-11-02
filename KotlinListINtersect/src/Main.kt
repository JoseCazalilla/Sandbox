fun main(args: Array<String>) {

    val myIntersectHelper = IntersectHelper().apply {
        fillArray(10000,5000)
        fillHashset(10000,5000)
    }

       val (execTime, res) = myIntersectHelper.calcIntersection()
    //    val (execTime, res) = myIntersectHelper.calcIntersectionForLoop()

    println("Execution time (ms): $execTime \t ElemsMatched: ${res.size}")
 }