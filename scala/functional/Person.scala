object Main{

    def getName(person : Person) : String = person.name

    def setName(person : Person, name : String) : Person = person.copy(name = name)

    def getAge(person : Person) : Int = person.age

    def setAge(person : Person, age : Int) : Person = person.copy(age = age)
    

    def main(args : Array[String]) : Unit = {

        val person = Person(name="matheus", age=23)

        println(getName(person))

    }

}

case class Person(name: String, age: Int)

    
