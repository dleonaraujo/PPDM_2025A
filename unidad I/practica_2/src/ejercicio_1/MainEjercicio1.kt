package ejercicio_1


class CuentaBancaria(private var saldo: Double, private var limiteRetiro: Double) {

    // Getter para obtener el saldo
    fun getSaldo(): Double {
        return saldo
    }

    // Setter para establecer el saldo con validación
    fun setSaldo(nuevoSaldo: Double) {
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo
        } else {
            println("Error: El saldo no puede ser negativo.")
        }
    }

    // Getter para obtener el límite de retiro
    fun getLimiteRetiro(): Double {
        return limiteRetiro
    }

    // Setter para establecer el límite de retiro con validación
    fun setLimiteRetiro(nuevoLimite: Double) {
        if (nuevoLimite > 0) {
            limiteRetiro = nuevoLimite
        } else {
            println("Error: El límite de retiro debe ser mayor que 0.")
        }
    }


}
