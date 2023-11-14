package com.lespsan543.cartas.Clases

class Carta(var nombre:String, var palo:String, var puntosMin:Int, var puntosMax:Int,var idDrawable:Int) {
    override fun toString(): String {
        return "Carta(nombre='$nombre', palo='$palo', puntosMin=$puntosMin, puntosMax=$puntosMax, idDrawable=$idDrawable)"
    }
}