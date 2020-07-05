object Acronym {
    /*fun generate(phrase: String) : String {
        val acronymInTheMaking = phrase.split(" ").map { it.split("-").map { it.dropWhile { !it.isLetter() }.firstOrNull() ?: "" } }
        val acronymResult = acronymInTheMaking.flatMap { it.toList() }.joinToString("").toUpperCase()
        return acronymResult
    }*/

    fun generate(phrase: String) : String {
        val acronymInTheMaking =
                phrase.replace("-", " ")
                        .split(" ")
                        .map {
                            it.dropWhile { !it.isLetter() }
                                    .firstOrNull() ?: ""
                        }
        val acronymResult = acronymInTheMaking.joinToString("").toUpperCase()
        return acronymResult
    }

}
