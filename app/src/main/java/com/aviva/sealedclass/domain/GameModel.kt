package com.aviva.seaedclass.domain


data class GameModel(
    val title:String,
    val serialNumber: String,
    val error: GameError
)

sealed class GameError(){
    object rayadoError:GameError()
    object sucioError:GameError()
    object noError :GameError()
    object congeladoError :GameError()

    data class versionError(
        val version: String):GameError()

}
