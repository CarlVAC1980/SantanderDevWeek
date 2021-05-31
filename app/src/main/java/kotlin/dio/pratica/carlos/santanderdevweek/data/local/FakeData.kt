package kotlin.dio.pratica.carlos.santanderdevweek.data.local

import kotlin.dio.pratica.carlos.santanderdevweek.data.Cartao
import kotlin.dio.pratica.carlos.santanderdevweek.data.Cliente
import kotlin.dio.pratica.carlos.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Igor")
        val cartao = Cartao("411111111111")
        return Conta(
                "445655-4",
                "6552-3",
                "R$ 2.450,80",
                "R$ 4.120,00",
                cliente,
                cartao
        )
    }
}