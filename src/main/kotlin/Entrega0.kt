package ar.edu.unsam.algo2

class Tripulante(var edad:Int, val nombre:String, val apellido:String,
                val dia_nac:Int, val mes_nac:Int, val año_nac:Int) {


}

open class Misiones(){



}


class Planeta(val nombre:String, var temperaturaMedia:Float, val gravedad:Float, val nivelRadiacion:Int,
              val hayAguaLiquida: Boolean, val toxicidadAtm:Int, val actTect:Int, val tamaño:Int,
              val distanciaAtierra:Int, var fueAterrizado:Boolean){

    fun tempIdeal() = temperaturaMedia > 0 && temperaturaMedia < 40
    fun gravedadSoportable() = gravedad > 3 && gravedad < 15



}



