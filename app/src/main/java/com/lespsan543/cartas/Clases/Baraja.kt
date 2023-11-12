package com.lespsan543.cartas.Clases

class Baraja {

    companion object{
        var listaCartas = ArrayList<Carta>()

        fun crearBaraja(){
            val listaNaipes = listOf("AS","DOS","TRES","CUATRO","CINCO","SEIS","OCHO","NUEVE","DIEZ","VALET","DAME","ROY")
            for (i in 1..13){
                listaCartas.add(Carta(listaNaipes[i-1],"CORAZONES",0,0,i))
            }
            for (i in 1..13){
                listaCartas.add(Carta(listaNaipes[i-1],"TREBOLES",0,0,i))
            }
            for (i in 1..13){
                listaCartas.add(Carta(listaNaipes[i-1],"PICAS",0,0,i))
            }
            for (i in 1..13){
                listaCartas.add(Carta(listaNaipes[i-1],"DIAMANTES",0,0,i))
            }
        }

        fun barajar(){
            listaCartas.shuffle()
        }

        fun dameCarta() : Carta{
            val ultimaCarta = listaCartas.get(listaCartas.size)
            listaCartas.dropLast(listaCartas.size)
            return ultimaCarta
        }
    }
}