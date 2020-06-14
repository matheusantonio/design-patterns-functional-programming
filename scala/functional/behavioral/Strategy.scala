package functional.behavioral

object Strategy{
    def algorithmInterfaceA() : Unit = {
        //Implementation
        println("Strategy A")
    }

    def algorithmInterfaceB() : Unit = {
        //Implementation
        println("Strategy B")
    }

    def ContextInterface(algorithmInterface : () => Unit) : Unit =
        algorithmInterface()
}