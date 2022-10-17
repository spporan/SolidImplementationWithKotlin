/**
* The Single responsibility Principle states that every class should have one and only one responsibility.
*  In other words, If there is a need to change the class for more than one reason then that
*  defies the single responsibility principle.
* 
 * Implement without  SRP
 */

data class Employee(
    val id: String,
    val name: String,
    val designation: String,
    val email: String,
    val salary: Double
) {

    fun saveEmployee() {
        //Need to save  employee data here
        println("saving employee data.....")
    }

    fun updateSalary(salaryRaised: Double) {
        println("updating employee salary data.....")
    }

}

/**
 * Implement properly maintain Single responsible principle
 */


data class Employee( val id: String,
                     val name: String,
                     val designation: String,
                     val email: String,
                     val salary: Double)

internal class EmployeeService(
    val dataSource: DataSource
) {
    fun save() {
        dataSource.saveEmployeInfo()
    }

    fun updateSalary() {
        dataSource.updateSalary(10000)
    }

}

internal class DataSource {
    fun saveEmployeInfo() {
        //Need to save  employee data here
        println("saving employee data.....")
    }

    fun updateSalary(salaryRaised: Double) {
        println("updating employee salary data.....")

    }
}