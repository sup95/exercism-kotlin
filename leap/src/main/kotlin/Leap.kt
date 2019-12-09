data class Year(val year: Int) {

    val isLeap: Boolean = isLeapYear()

    fun isLeapYear() : Boolean {
        return year % 4 == 0 && if(year % 100 == 0) year % 400 == 0 else true
    }
}
