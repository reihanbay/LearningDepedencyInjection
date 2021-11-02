package com.trytolearn.didagger

import dagger.Module
import dagger.Provides

@Module
class BattleModule {

    //Menyediakan Dependenci yang akan digunakan dengan Parameter didalam Class Senjata
    @Provides
    fun senjata() : Senjata {
        return Senjata("Pedang Larva", "Tombak Api")
    }
}