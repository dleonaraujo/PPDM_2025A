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


}
