package com.example.annisamytechnologyapp.ui.model

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.annisamytechnologyapp.R

class TechnologyViewModel {
    private val _name = MutableLiveData<String>()
    private val _kapasitas = MutableLiveData<String>()

    val nama : LiveData<String> = _name
    val kapasitas : LiveData<String> = _kapasitas

        fun loadTechnologyList () : List<TechnologyList> {
            return listOf(
                TechnologyList(R.string.samsung_s22_ultra, R.string.samsung_s22_ultra_kapasitas),
                TechnologyList(R.string.samsung_s22, R.string.samsung_s22_kapasitas),
                TechnologyList(R.string.samsung_z_fold3, R.string.samsung_z_fold3_kapasitas),
                TechnologyList(R.string.samsung_a33, R.string.samsung_a33_kapasitas),
                TechnologyList(R.string.asus_zenbook, R.string.asus_zenbook_kapasitas),
                TechnologyList(R.string.asus_expertbook_b9, R.string.asus_expertbook_b9_kapasitas),
                TechnologyList(R.string.asus_vivobook, R.string.asus_vivobook_kapasitas),
                TechnologyList(R.string.asus_expertbook_b5_flip, R.string.asus_expertbook_b5_flip_kapasitas)
            )
        }

    fun setData(data: TechnologyList, context: Context) {
        _name.value = context.getString(data.nameId)
        _kapasitas.value = context.getString(data.kapasitasId)
    }
}