package src

class Departamento(val listaEmpleados: MutableList<Empleado> = mutableListOf()) {
    fun agregarEmpleado(empleado: Empleado){
        listaEmpleados.add(empleado)
        println("¡Empleado ${empleado.nombre} agregado con éxito!")
    }

    fun calculaSalarioTotal(){
        var total = 0.0
        for (empleado in listaEmpleados){
            total += empleado.calculaSalario()
            println("${empleado.nombre} con ID--${empleado.id} tiene un salario de ${empleado.calculaSalario()} al mes.")
        }
        println("El total de salario entre todos los empleados es de $total€")
    }
}