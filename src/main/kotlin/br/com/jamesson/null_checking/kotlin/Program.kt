package br.com.jamesson.null_checking.kotlin

fun main() {
    val m: Meeting? = null
    var newMeeting = Meeting()

    // CASO m SEJA NULO CRIE UMA NOVA INSTANCIA
    newMeeting = m ?: Meeting()
    println(closeMeeting(m))
    println(closeMeeting(newMeeting))

    // O LET SO SERA CHAMADO SE O M NAO FOR NULO
    m?.let {
        closeMeetingNonNull(m)
    }
}

fun closeMeetingNonNull(m: Meeting): Boolean? {
    return if (m.canClose) m.close()
    else false
}

fun closeMeeting(m: Meeting?): Boolean? {
//    return if (m?.canClose == true) m?.close()
//    else false

    // EVITAR USAR O !! (POIS ELE GARANTE PARA O COMPILADOR QUE O OBJETO NAO E NULO)
    return if (m!!.canClose) m.close()
    else false
}

class Meeting {
    val canClose: Boolean = false

    fun close(): Boolean {
        return true
    }

    fun save(o: Any){
        //as? VERIFICA SE O OBJETO É DAQUELE TIPO, CASO NAO FOR SETA O VALOR NULL
        val saveable = o as? ISaveable
        saveable?.save()

    }
}

interface ISaveable {
    fun save()
}
