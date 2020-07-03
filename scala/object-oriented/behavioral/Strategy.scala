package object-oriented.behavioral

object Strategy{

    trait Strategy {
        def execute(a : Int, b : Int) : Int
    }

    class ConcreteStrategyAdd() extends Strategy {
        def execute(a : Int, b : Int) : Int = {
            a + b
        }
    }

    class ConcreteStrategySubtract() extends Strategy {
        def execute(a : Int, b : Int) : Int = {
            a - b
        }
    }

    class ConcreteStrategyMultiply() extends Strategy {
        def execute(a : Int, b : Int) : Int = {
            a * b
        }
    }

    class Context() {
        
        private var strategy : Strategy

        def setStrategy(strategy : Strategy) =
            this.strategy = strategy

        def executeStrategy(a : Int, b : Int) : Int =
            this.strategy.execute(a, b)

    }
}