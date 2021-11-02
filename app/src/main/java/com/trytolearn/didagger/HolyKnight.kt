package com.trytolearn.didagger

import javax.inject.Inject

class HolyKnight @Inject constructor(private val senjata: Senjata) {

    fun setEquip() : String {
        return "HolyKnight bertarung menggunakan senjata ${senjata.pedang()}"
    }
}