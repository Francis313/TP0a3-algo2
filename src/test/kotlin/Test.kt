
package ar.edu.unsam.algo2
//Abajo ta todos los imports para los tests
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

/*
class TodoListTest {

    @Test
    @DisplayName("Tarea nueva debería crearse sin cumplir por defecto")
    fun tareaNuevaNoEstaCumplida() {
        val lista = todoList()
        val tarea = Tarea("Estudiar Kotlin")
        lista.agregar(tarea)
        assertFalse(lista.estanCumplidas())
    }

}

*/


// Entrega 0 Tests

class xPace {

        @Test
        @DisplayName("Un planeta tiene temperatura ideal para el ser humano (0°C a 40°C) y  una gravedad soportable  (entre 15 m/s² y 3 m/s²)?")
        fun testeoPlaneta(){

            //CREAMOS VARIABLE ADENTRO
            val testPlanetaDesconocido= Planeta(
                nombre="SegundaTierra",
                temperaturaMedia=26.5f,
                gravedad=10f,
                nivelRadiacion=1,
                hayAguaLiquida=true,
                toxicidadAtm=0,
                actTect=1,
                tamaño=800,
                distanciaAtierra=300,
                fueAterrizado=false
            )

            assertTrue(testPlanetaDesconocido.tempIdeal())
            assertTrue(testPlanetaDesconocido.gravedadSoportable())
        }
    }


