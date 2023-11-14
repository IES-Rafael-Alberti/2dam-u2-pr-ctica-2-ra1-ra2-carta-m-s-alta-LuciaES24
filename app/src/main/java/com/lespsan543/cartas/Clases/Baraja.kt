package com.lespsan543.cartas.Clases

class Baraja {

    var listaCartas = ArrayList<Carta>()

    companion object{
        var baraja = Baraja()

        fun crearBaraja() : ArrayList<Carta> {
            val listaNaipes = listOf("AS","DOS","TRES","CUATRO","CINCO","SEIS","OCHO","NUEVE","DIEZ","VALET","DAME","ROY")
            for (i in 0..12-1){
                baraja.listaCartas.add(Carta(listaNaipes[i],"CORAZONES",0,0,i+1))
            }
            for (i in 0..12-1){
                baraja.listaCartas.add(Carta(listaNaipes[i],"TREBOLES",0,0,i+1))
            }
            for (i in 0..12-1){
                baraja.listaCartas.add(Carta(listaNaipes[i],"PICAS",0,0,i+1))
            }
            for (i in 0..12-1){
                baraja.listaCartas.add(Carta(listaNaipes[i],"DIAMANTES",0,0,i+1))
            }
            return baraja.listaCartas
        }

        fun barajar(){
            baraja.listaCartas.shuffle()
        }

        fun dameCarta() : Carta{
            val ultimaCarta = baraja.listaCartas.last()
            baraja.listaCartas.dropLast(1)
            return ultimaCarta
        }
    }
}