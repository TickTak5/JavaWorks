package ProjectsOOP.BankaHesabi

open abstract class BankaHesabi {
    abstract fun paraYatir(miktar: Int): Int
    abstract fun paraCek(miktar: Int): Int
    abstract fun bakiyeOgren(): Int
}

class VadeliHesap(var name: String) : BankaHesabi() {
    var toplamBakiyeVadeli: Int = 0

    override fun paraYatir(miktar: Int): Int {
        println("para yatırma işlemi başarılı..")
        toplamBakiyeVadeli += miktar
        return toplamBakiyeVadeli
    }

    override fun paraCek(miktar: Int): Int {
        if (toplamBakiyeVadeli - miktar < 0) {
            println("yeterli miktarda para bulunmuyor!!")
            return toplamBakiyeVadeli
        } else {
            println("para çekme işlemi başarılı..")
            toplamBakiyeVadeli -= miktar
            return toplamBakiyeVadeli
        }
    }

    override fun bakiyeOgren(): Int {
        return toplamBakiyeVadeli
    }
}

class Vadesizhesap(var name: String) : BankaHesabi() {
    var toplamBakiyeVadesiz = 0
    override fun paraYatir(miktar: Int): Int {
        println("para yatırma işlemi başarılı..")
        toplamBakiyeVadesiz += miktar
        return toplamBakiyeVadesiz
    }

    override fun paraCek(miktar: Int): Int {
        if (toplamBakiyeVadesiz - miktar < 0) {
            println("yeterli miktarda para bulunmuyor!!")
            return toplamBakiyeVadesiz
        } else {
            toplamBakiyeVadesiz -= miktar
            return toplamBakiyeVadesiz
        }
    }

    override fun bakiyeOgren(): Int {
        return toplamBakiyeVadesiz
    }
}