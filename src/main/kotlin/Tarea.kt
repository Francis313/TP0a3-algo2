package ar.edu.unsam.algo2
// package se usa en todos lo archivos nuevos para no tener que importar
// los demas y no joda en los test.


/*
  var variable mutable
  val variable inmutable
  clase con parámetros -> class NombreClase(val param1: Tipo, var param2: Tipo) { ... }
  crear clase publica open class Base { ... }
  herencia -> class Derivada : Base() { ... }
  abstract class Abstracta { abstract fun metodoAbstracto() }
*/


class Tarea(val descripcion: String="", var cumplido: Boolean = false) {
    private val tareas = mutableListOf<Tarea>()

    fun agregar(tarea: Tarea) {
        tareas.add(tarea)
    }

    fun cambiarEstado(){
        cumplido = !cumplido
    }

    fun estaCumplida() = cumplido

}
class todoList {
    var tareas: MutableList<Tarea> = mutableListOf<Tarea>()
    fun agregar(tarea: Tarea){
        tareas.add(tarea)
    }
    fun estanCumplidas(): Boolean{
        return tareas.all{ it.estaCumplida() }
    }
    fun estaEnProgreso() = tareas.any { it.cumplido } && tareas.any { !it.cumplido }
}