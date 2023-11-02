package com.aviva.sealedclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aviva.seaedclass.domain.GameModel

class MainActivity : AppCompatActivity() {

    val gameList = listOf<GameModel>(
        GameModel("Mario Bros", "0001", "Rayado"),
        GameModel("Halo", "0002", "Sucio"),
        GameModel("Isaac", "0003", "")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gameList.forEach {gameModel ->
            when(gameModel.error){
                "Rayado" -> llevarAlSoporteTecnico()
                "Sucio" -> llamarAlSoporteTecnico()
                "" -> vender()
                else  -> {}
            }
        }
    }

    fun  llevarAlSoporteTecnico(){}

    fun llamarAlSoporteTecnico(){}

    fun vender(){}

    fun eliminarJuego(){}
}