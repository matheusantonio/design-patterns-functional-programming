package functional.behavioral

object TemplateMethod{

    def predefinedOperation() : Unit =
        //Implementation

    def templateMethod(primitiveOperation1 : () => Unit, primitiveOperation2 : () => Unit) = {
        primitiveOperation1()
        predefinedOperation()
        primitiveOperation2()
    }

    def primitiveOperation1() : Unit = 
        //Implementation

    def primitiveOperation2() : Unit = 
        //Implementation

}