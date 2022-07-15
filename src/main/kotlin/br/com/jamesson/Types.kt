package br.com.jamesson

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: KevinTime) = setTime(time.hours)
}

interface EndOfTheWorld {
    fun setTime(time: KevinTime) {}
}

class KevinTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetTime : Time, EndOfTheWorld {
    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("Not yet implemented")
    }

    override fun setTime(time: KevinTime) {
        super<Time>.setTime(time)
        super<EndOfTheWorld>.setTime(time)
    }

}