package functional.behavioral

object Strategy{
    def executeAdd(a : Int, b: Int) : Int = {
        a + b
    }

    def executeSubtract(a : Int, b: Int) : Int = {
        a - b
    }

    def executeMultiply(a : Int, b: Int) : Int = {
        a * b
    }

    def executeStrategy(execute : (a : Int, b : Int) => Int) : Int =
        execute(a, b)


    def executeOutOfScope(a : Int, b : Int) : Int = {
        a ** 2 + b ** 2
    }

}