package com.trytolearn.didagger

import javax.inject.Inject


class DarkKnight @Inject constructor(private val senjata: Senjata) {
    fun setEquip() : String {
        return "The DarkKnight tempur dengan ${senjata.tombak()}"
    }
}