package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

operator fun MyDate.compareTo(other: MyDate): Int {
    if (this.year < other.year) {
        return -1
    } else if (this.year > other.year) {
        return 1
    } else {
        if (this.month < other.month) {
            return -1
        } else if (this.month > other.month) {
            return 1
        } else {
            if (this.dayOfMonth < other.dayOfMonth) {
                return -1
            } else if (this.dayOfMonth > other.dayOfMonth) {
                return 1
            } else {
                return 0
            }
        }
    }
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)

operator fun DateRange.contains(d: MyDate): Boolean {
    return d >= this.start && d <= this.endInclusive
}
