package object-oriented.behavioral

object Strategy{

    trait Strategy {
        def algorithmInterface() : Unit
    }

    class ConcreteStrategyA() extends Strategy {
        def algorithmInterface() : Unit = {
            // Implementation
            println("Strategy A")
        }
    }

    class ConcreteStrategyB() extends Strategy {
        def algorithmInterface() : Unit = {
            // Implementation
            println("Strategy B")
        }
    }

    class Context(var strategy : Strategy) {
        def setStrategy(strategy : Strategy) =
            this.strategy = strategy

        def contextInterface() : Unit = {
            this.strategy.algorithmInterface()
        }
    }
}