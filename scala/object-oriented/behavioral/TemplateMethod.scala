package object-oriented.behavioral

object TemplateMethod{

    abstract class AbstractClass(){
        def templateMethod() : Unit = {
            primitiveOperation1()
            predefinedOperation()
            primitiveOperation2()

        }

        def predefinedOperation() : Unit = {
            //Implementation
        }

        def primitiveOperation1() : Unit

        def primitiveOperation2() : Unit
    }

    class ConcreteClass() extends AbstractClass{
        
        def primitiveOperation1() : Unit = {
            //Implementation
        }

        def primitiveOperation2() : Unit = {
            //Implementation
        }
    }
}