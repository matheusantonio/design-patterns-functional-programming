object Main{

    def main(args : Array[String]) : Unit = {

        var person = new Person("matheus", 23)

        println(person.getName())
    }
}

class Person(private var name :String, private var age : Int){

    def getName() : String = this.name

    def setName(name : String) : Unit = this.name = name

    def getAge() : Int = this.age

    def setAge(age : Int) : Unit = this.age = age
}
