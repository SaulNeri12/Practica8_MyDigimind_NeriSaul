package neri.saul.mydigimind

import java.io.Serializable

class Carrito: Serializable {
    private var recordatorios = ArrayList<Recordatorio>()

    fun agregar(p: Recordatorio): Boolean {
        return recordatorios.add(p)
    }
}