package ProjectsOOP

fun main() {
    while (true){
        print("şifre girin:")
        val sifre = readln()
        if (sifreGecerliMi(sifre)){
            println("şifre geçerli")
            break
        }else println("şifre geçersiz")
    }


}

fun sifreGecerliMi(sifre:String): Boolean {
    val enAzSekizKarakter = sifre.any() {sifre.length >= 8}
    val buyukHarf = sifre.any() {it.isUpperCase()}
    val rakamVarMi = sifre.any() {it.isDigit()}

    return enAzSekizKarakter && buyukHarf && rakamVarMi
}
