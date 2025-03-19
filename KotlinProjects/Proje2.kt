package ProjectsOOP

fun main() {
    var ogr1:Ogrenci = Ogrenci("taha",25,"tahertunca@gmail.com")
    ogr1.bilgileriGoster()
    
}

class Ogrenci(var isim:String,var yas:Int, var ePosta:String){
    fun bilgileriGoster(){
        println("isim: $isim yaş: $yas e-posta: $ePosta")
    }
}