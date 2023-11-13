package com.lespsan543.cartas.Clases

class Baraja {

    var listaCartas = ArrayList<Carta>()

    companion object{
        var baraja = Baraja()

        fun crearBaraja() : ArrayList<Carta> {
            val listaNaipes = listOf("AS","DOS","TRES","CUATRO","CINCO","SEIS","OCHO","NUEVE","DIEZ","VALET","DAME","ROY")
            for (i in 1..13){
                baraja.listaCartas.add(Carta(listaNaipes[i-1],"CORAZONES",0,0,i))
            }
            for (i in 1..13){
                baraja.listaCartas.add(Carta(listaNaipes[i-1],"TREBOLES",0,0,i))
            }
            for (i in 1..13){
                baraja.listaCartas.add(Carta(listaNaipes[i-1],"PICAS",0,0,i))
            }
            for (i in 1..13){
                baraja.listaCartas.add(Carta(listaNaipes[i-1],"DIAMANTES",0,0,i))
            }
            return baraja.listaCartas
        }

        fun barajar(){
            baraja.listaCartas.shuffle()
        }

        fun dameCarta() : Carta{
            val ultimaCarta = baraja.listaCartas.get(baraja.listaCartas.size)
            baraja.listaCartas.dropLast(baraja.listaCartas.size)
            return ultimaCarta
        }
    }
}