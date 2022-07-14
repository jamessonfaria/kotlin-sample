package br.com.jamesson

fun main(args: Array<String>) {
    val text = "With      multiple \t whitespace"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceExtension())
}

fun replaceMultipleWhiteSpace(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceMultipleWhiteSpaceExtension() : String { // extension functions
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}