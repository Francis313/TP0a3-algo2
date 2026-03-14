package ar.edu.unsam.algo2

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals



val juan = Tripulante(32,"juan","carlos",28,11,2004)

// Entrega 0 Tests

class xPace {
    @Test
    @DisplayName("Tarea de testeo de Mision")
    fun testeoMisiones() {
        juan.misionesExitosas = 5
        juan.misionesParcialmenteExitosas = 9
        juan.misionesFracasadas = 23

        assertEquals(5,juan.misionesExitosas)
        assertNotEquals(12,juan.misionesParcialmenteExitosas)
        assertEquals(23,juan.misionesFracasadas)

    }

}
