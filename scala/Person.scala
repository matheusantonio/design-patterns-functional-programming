object Person{

    def main(args : Array[String]) : Unit = {
        /* var person = new Person("matheus", 23)

        println(person.getName()) */

        var person = Person("matheus", 23)

        println(person.name)

        var newperson = setName(person, "fulano")

        println(newperson.name)
    }

    /* class Person(var name : String, var age : Int){

        def getName() : String = this.name

        def setName(name : String) : Unit = this.name = name

        def getAge() : Int = this.age

        def setAge(age : Int) : Unit = this.age = age
    } */

    case class Person(name: String, age: Int)

    def getName(person : Person) : String = person.name

    def setName(person : Person, name : String) : Person = person.copy(name = name)

    def getAge(person : Person) : Int = person.age

    def setAge(person : Person, age : Int) : Person = person.copy(age = age)

}