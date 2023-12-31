package OOPS

fun main() {
    println("program started")
    val student1 = Student("durgesh", 124, "Engineer")
//    student1.name = "durgesh"
//    student1.id = 124
//    student1.about = "Engineer"

    student1.sayHello()
    student1.printDetail()

    val student2 = Student("Ankit", 1423, "Java expert")
//    student2.name = "Ankit"
//    student2.id = 1423
//    student2.about = "Java Expert"
    student2.printDetail()
}

//class object :

//how to create class

class Student(var name: String, var id: Int, var about: String) //class header
{
    init {
        println("Creating object with $name , $id, $about")
    }

    init {

    }
    //    class body
//    var name: String = ""
//    var id: Int = 0
//    var about: String = ""
    //... add more properties

    fun sayHello() {
        println("hello, i am $name")
    }

    fun printDetail() {
        println("------------------")
        println(id)
        println(name)
        println(about)
    }
}

class employee {
    constructor (emp_id : Int, emp_name: String ) {
        var id: Int = emp_id
        var name: String = emp_name
        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }

    constructor (emp_id : Int, emp_name: String ,emp_salary : Double) {
        var id: Int = emp_id
        var name: String = emp_name
        var salary : Double = emp_salary
        print("Employee id is: $id, ")
        print("Employee name: $name, ")
        println("Employee name: $salary")
    }
}



