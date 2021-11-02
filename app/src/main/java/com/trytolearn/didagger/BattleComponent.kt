package com.trytolearn.didagger

import dagger.Component

@Component(modules = [BattleModule::class])
interface BattleComponent {
    fun injection(context: MainActivity?)
}