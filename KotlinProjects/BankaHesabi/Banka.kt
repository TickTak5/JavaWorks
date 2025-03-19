package ProjectsOOP.BankaHesabi

var vadeliHesap: VadeliHesap = VadeliHesap(name = "vadeli")
var vadesizHesap: Vadesizhesap = Vadesizhesap(name = "vadesiz")
fun main() {

    menuGoster()

    while (true) {
        print("seçimi tuşlayınız(menüyü tekrar görmek için 4): ")
        var secim: Int = readln().toInt()
        if (secim != 0) {
            when (secim) {
                1 -> bakiyeOgren()
                2 -> paraYatir()
                3 -> paraCek()
                4 -> menuGoster()
                else -> println("geçersiz seçim")
            }
        } else {
            println("banka hesabı kapatılıyor..")
            return
        }
    }
}

private fun paraCek() {
    print("hangi hesabınızdan para çekmek istiyorsunuz?(Vadeli-Vadesiz): ")
    var secim = readln()
    print("\nÇekmek istediğiniz miktarı girin: ")
    var miktar: Int = readln().toInt()

    if (secim.lowercase() == vadeliHesap.name) {
        vadeliHesap.paraCek(miktar)
    } else if (secim.lowercase() == vadesizHesap.name) {
        vadesizHesap.paraCek(miktar)
    } else println("hesap bulunamadı")

}

private fun paraYatir() {
    print("hangi hesabınıza para yatırmak istiyorsunuz?(Vadeli-Vadesiz): ")
    var secim = readln()
    print("\nyatırmak istediğiniz miktarı girin: ")
    var miktar: Int = readln().toInt()
    if (secim.lowercase() == vadeliHesap.name) {
        vadeliHesap.paraYatir(miktar)
    } else if (secim.lowercase() == vadesizHesap.name) {
        vadesizHesap.paraYatir(miktar)
    } else println("hesap bulunamadı")

}

private fun bakiyeOgren() {
    println("vadeli hesap bakiyeniz: ${vadeliHesap.bakiyeOgren()}")
    println("vadesiz hesap bakiyeniz: ${vadesizHesap.bakiyeOgren()}")
}

private fun menuGoster() {
    println(
        "0 - çıkış\n" +
                "1 - Bakiye\n" +
                "2 - Para Yatır\n" +
                "3 - Para Çek"
    )
}
