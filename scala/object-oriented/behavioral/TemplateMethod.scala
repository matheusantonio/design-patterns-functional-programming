package object-oriented.behavioral

object TemplateMethod{

    abstract class AbstractClass(){
        def templateMethod() : Unit = {
            primitiveOperation1()
            primitiveOperation2()

        }
        def primitiveOperation1() : Unit

        def primitiveOperation2() : Unit
    }

    class ConcreteClass(){
        
        def primitiveOperation1() : Unit = {
            //Implementation
        }

        def primitiveOperation2() : Unit = {
            //Implementation
        }
    }
}