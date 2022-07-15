package br.com.jamesson

/*
* Koltin por padrao as classes sao "final" não podem ser herdadas
* os metodos são "final" nao podem ser sobrescritos
*
* Por padrao as classes sao publicas, nao existe o modificador do java
* package-private padrao
*
* */

// open na classe para permitir ela ser herdada
open class PersonNova {
    var firstName: String = ""
    var lastName: String = ""

    // open no metodo para permitir ele ser sobrescrito
    open fun getName(): String = "$firstName $lastName"
}

class Student: PersonNova() {
    override fun getName(): String{
        return ""
    }
}

/********** ABSTRACT *************/

abstract class PersonAbstract {
    var firstName: String = ""
    var lastName: String = ""
    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Student2 : PersonAbstract() {
    override fun getAddress(): String {
        return "Address for ${super.firstName} / ${super.lastName}"
    }

}