package src

fun main(){
    val listaEmpleados = mutableListOf<Empleado>()

    val departamento1 = Departamento(listaEmpleados)
    val empleado1 = EmpleadoPorHora("Donavan", "7302937F", 400, 110.0)
    val empleado2 = EmpleadoFijo("Zediaph", "83640201H", 2300.0, 12)
    val empleado3 = EmpleadoPorHora("NawyF", "69340942J", 360, 203.1)

    departamento1.agregarEmpleado(empleado1)
    departamento1.agregarEmpleado(empleado2)
    departamento1.agregarEmpleado(empleado3)

    departamento1.calculaSalarioTotal()
}