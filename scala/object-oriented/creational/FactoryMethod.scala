package object-oriented.creational

object FactoryMethod{

    trait Product{
        def doStuff() : Unit
    }

    class ConcreteProduct extends Product(){

        def doStuff() : Unit = {
            //Implementation
        }
    }

    abstract class Creator(){

        def someOperation() : Unit = {
            var p = createProduct()
            p.doStuff()
        }

        def createProduct() : Product
    }

    class ConcreteCreator() extends Creator{

        def createProduct() : Product = {
            return new ConcreteProduct()
        }
    }
}