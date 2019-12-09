object Pangram {
//    fun isPangram(input: String): Boolean =
//            input.toSet().filter {
//                it in ('a'..'z').toList() || it in ('A'..'Z')
//            }.map {
//                it.toLowerCase()
//            }.containsAll(('a'..'z').toList())

    fun isPangram(input: String): Boolean = ('a'..'z').all { input.toLowerCase().contains(it) }
}
