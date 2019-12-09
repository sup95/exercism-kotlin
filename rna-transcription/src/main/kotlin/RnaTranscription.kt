//fun transcribeToRna(dna: String): String {
//    var result = ""
//    dna.forEach {
//        when(it) {
//            'G' -> result += 'C'
//            'C' -> result += 'G'
//            'T' -> result += 'A'
//            'A' -> result += 'U'
//            else -> result
//        }
//    }
//
//    return result
//}

val dnaToRna = mapOf('G' to 'C', 'C' to 'G', 'T' to 'A', 'A' to 'U')
fun transcribeToRna(dna: String): String =
    dna.fold("", {result, it ->
        result + dnaToRna[it]
    })