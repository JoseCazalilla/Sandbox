fun main(args: Array<String>) {
    val myIntersectHelper = IntersectHelper()
    myIntersectHelper.fillArray(2000,2000)
    myIntersectHelper.fillHashset(2000,2000)

    val (execTime, res) = myIntersectHelper.calcIntersection()
//    val (execTime, res) = myIntersectHelper.calcIntersectionForLoop()

    println("Execution time (ms): $execTime \t ElemsMatched: ${res.size}")
}