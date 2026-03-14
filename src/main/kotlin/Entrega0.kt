package ar.edu.unsam.algo2

import java.time.Year

class Tripulante(var edad:Int, val nombre:String, val apellido:String,
                val dia_nac:Int, val mes_nac:Int, val año_nac:Int) {
    var diaInicio = 0
    var mesInicio = 0
    var anioInicio = 0

    fun fechaIncio(): String = "$diaInicio/$mesInicio/$anioInicio"
    //fun experiencia() = (Year.now().value - añoInicio) + (misionesExitosas/2) + (misionesFracasadas/2) + (parcialmenteExitosas/4)

}

open class Misiones(){



}


class Planeta(val nombre:String, var temperaturaMedia:Float, val gravedad:Float, val nivelRadiacion:Int,
              val hayAguaLiquida: Boolean, val toxicidadAtm:Int, val actTect:Int, val tamaño:Int,
              val distanciaAtierra:Int, var fueAterrizado:Boolean){

    fun tempIdeal() = temperaturaMedia > 0 && temperaturaMedia < 40
    fun gravedadSoportable() = gravedad > 3 && gravedad < 15



}



