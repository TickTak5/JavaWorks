package ProjectsOOP.TODOList

var jobList = arrayListOf<String>()
var completedList = ArrayList<Jobs>()
var job: Jobs = Jobs("")

fun main() {
    menuGoster()
    while (true) {
        print("seçiminizi girin(menüyü tekrar görmek için 5)")
        var secim: Int = readln().toInt()
        if (secim != 0) {
            when (secim) {
                1 -> isEkle()
                2 -> isSil()
                3 -> isleriListele()
                4 -> gorevTamamla()
                5 -> menuGoster()
            }
        } else {
            println("çıkış yapılıyor..")
            return
        }
    }
}

fun gorevTamamla() {
    print("tamamlanan görevin ismini girin: ")
    var name = readln()
    job.completeJob(name)

}

fun isleriListele() {
    var joblist = jobList
    for (jobl in joblist) {
        println(jobl)
    }
}

fun isSil() {
    println("silmek istediğiniz işin ismini girin")
    var jobName = readln()
    job.deleteJob(jobName)

}

fun isEkle() {

    print("eklemek istediğiniz işin ismini girin: ")
    var jobName = readln()
    job.addJob(jobName)
}

fun menuGoster() {
    println(
        "********** MENU ***********\n" +
                "0 - ÇIKIŞ\n" +
                "1 - iş ekle\n" +
                "2 - iş sil\n" +
                "3 - işleri listele\n" +
                "4 - görev tamamla"
    )
}
