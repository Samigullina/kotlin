open class Person (var name: String) : Comparable<Person> {
    var age:Int = 0; 
/* не могу создать новое поле без инициализации,
 * но в этом случае экземпляру val person1 = Person("Beatrix") присваивается возраст 0 :(
 */
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
    
    val isAdult: Boolean get() = this.age >= 18
    override fun toString(): String = 
    "${this.name}, ${this.age} years old, ${when (isAdult) {true -> "adult" false -> "underage"}}"
    override fun compareTo(other:Person):Int {
        if (this.age > other.age) {println("${this.name} is older than ${other.name}"); return 1 }
        if (this.age < other.age) {println("${this.name} is yonger than ${other.name}"); return -1}
        else {println("${this.name} and ${other.name} of the same age"); return 0}
        
    }
}

class Employee(name: String, age: Int, var phone: String) : Person(name, age) {
    override fun toString(): String = 
    "${this.name}, ${this.age} years old, phone: ${this.phone}"
}


fun main(args: Array<String>) {
	val person1 = Person("Beatrix")
	val person2 = Person("Mathilda", 13)
	val person3 = Person("Vincent", 45)
    println(person2.toString())
    println(person1.toString())
    person2.compareTo(person3)
    val emp1 = Employee (person2.name, person2.age, "89600661806")
    println(emp1.toString())
}