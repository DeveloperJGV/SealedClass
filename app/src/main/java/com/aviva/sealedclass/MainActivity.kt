package com.aviva.sealedclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aviva.seaedclass.domain.GameError
import com.aviva.seaedclass.domain.GameError.*
import com.aviva.seaedclass.domain.GameModel

class MainActivity : AppCompatActivity() {

    val gameList = listOf<GameModel>(
        GameModel("Mario Bros", "0001", noError),
        GameModel("Halo", "0002", sucioError),
        GameModel("Isaac", "0003", rayadoError),
        GameModel("Pacman", "0003", versionError("1.0.1"))
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gameList.forEach {gameModel ->
            when(gameModel.error){
                noError -> vender()
                rayadoError -> llamarAlSoporteTecnico()
                sucioError -> llevarAlSoporteTecnico()
                congeladoError -> eliminarJuego()
                /**
                 *  No se recomienda poner el else en estos casos para siempre tener
                 *  una buena respuesta cuando cae al caso
                 *
                 */
                //else -> {}
                is versionError -> consultarVersion(gameModel.error.version)
            }
        }
    }

    fun  llevarAlSoporteTecnico(){}

    fun llamarAlSoporteTecnico(){}

    fun vender(){}

    fun eliminarJuego(){}

    fun consultarVersion(version:String){}
}