package src

abstract class Empleado(val nombre: String, val id: String) {
    abstract fun calculaSalario(): Double
}