package src

class EmpleadoFijo(nombre: String, id: Int, val salarioFijo: Double, val numPagas: Int): Empleado(nombre, id) {
    override fun calculaSalario(): Double {
        return salarioFijo * numPagas
    }

    override fun toString(): String {
        return "El empleado $nombre ($id), tiene un salario fijo de $salarioFijo€. Como su número de pagas al mes es de $numPagas, su salario mensual es de ${calculaSalario()}€"
    }
}