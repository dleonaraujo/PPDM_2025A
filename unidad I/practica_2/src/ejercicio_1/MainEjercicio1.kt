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

    // Método para realizar un retiro considerando el límite de retiro
    fun retirar(monto: Double) {
        if (monto > saldo) {
            println("Error: Saldo insuficiente.")
        } else if (monto > limiteRetiro) {
            println("Error: El monto excede el límite de retiro de $limiteRetiro.")
        } else {
            saldo -= monto
            println("Retiro exitoso. Nuevo saldo: $saldo")
        }
    }
}
