package ProjectsOOP.TODOList

class Jobs(val name: String) {

    fun addJob(name: String): Boolean {
        if (jobList.contains(name)) {
            println("bu görev zaten var")
            return false

        } else {
            jobList.add(name)
            println("başarıyla eklendi")
            return true
        }
    }

    fun deleteJob(name: String): Boolean {
        if (jobList.contains(name)) {
            println("görev başarıyla silindi")
            jobList.remove(name)
            return true
        } else {
            println("görev mevcut değil")
            return false
        }

    }

    fun completeJob(name: String): Boolean {
        if (jobList.contains(name)) {
            if (!completedList.contains(job)) {
                completedList.add(job)
                println("$name görev tamamlandı")
                return true
            } else {
                println("görev zaten tamamlanmış")
                return false
            }
        } else {
            println("görev mevcut değil")
            return false
        }
    }

}