package kotlin.dio.pratica.carlos.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.dio.pratica.carlos.santanderdevweek.data.Conta
import kotlin.dio.pratica.carlos.santanderdevweek.data.local.FakeData

class MainViewModel : ViewModel() {

    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente() : LiveData<Conta> {
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }
}