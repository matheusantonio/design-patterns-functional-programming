package object-oriented.creational

class Database private () {

    def query(sql)

}

object Database {

    private val _instance = new Database()
    def instance() = _instance

}