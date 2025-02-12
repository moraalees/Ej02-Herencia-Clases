package src

class EmpleadoPorHora(nombre: String, id: Int, val horasMensuales: Int, val tarifaPorHora: Double): Empleado(nombre, id) {
    init{
        require(horasMensuales in 1..730){"Las horas no deben ser menores que 1 o mayores que 730..."}
    }

    override fun calculaSalario(): Double {
        return horasMensuales * tarifaPorHora
    }

    override fun toString(): String {
        return "El empleado $nombre ($id), trabaja $horasMensuales horas al mes. Su tarifa por hora es de $tarifaPorHora€, y su salario es de ${calculaSalario()}€"
    }
}