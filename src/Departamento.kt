package src

class Departamento(val listaEmpleados: MutableList<Empleado> = mutableListOf()) {
    fun agregarEmpleado(empleado: Empleado){
        listaEmpleados.add(empleado)
        println("¡Empleado ${empleado.nombre} agregado con éxito!")
    }

    fun calculaSalarioTotal(){
        var total = 0.0
        for (empleado in listaEmpleados){
            val salario = String.format("%.2f", empleado.calculaSalario())
            total += empleado.calculaSalario()
            println("${empleado.nombre} con ID--${String.format("%04d", empleado.id)} tiene un salario de ${salario} al mes.")
        }
        println("El total de salario entre todos los empleados es de ${String.format("%.2f", total)}€")
    }
}