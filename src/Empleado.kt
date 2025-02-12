package src

abstract class Empleado(val nombre: String, val id: Int) {
    init{
        require(id in 0..9999){ "El ID debe ser positivo y menor que 9999." }
    }

    abstract fun calculaSalario(): Double
}