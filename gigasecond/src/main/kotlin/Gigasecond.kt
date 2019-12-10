import java.time.LocalDateTime
import java.time.LocalDate

class Gigasecond(val inputDateTime: LocalDateTime) {

    constructor(inputDate: LocalDate) : this(inputDate.atStartOfDay())

    val date: LocalDateTime = inputDateTime.plusSeconds(1000000000)
}
