object Hamming {

    /*fun compute(leftStrand: String, rightStrand: String): Int {
        *//*if(leftStrand.length != rightStrand.length)
            throw IllegalArgumentException("left and right strands must be of equal length")

        var count = 0
        for(i in leftStrand.indices) {
            if(leftStrand[i] != rightStrand[i])
                count++
        }

        return count*//*

        require(leftStrand.length == rightStrand.length) { "left and right strands must be of equal length" }

        return leftStrand.zip(rightStrand).count{ it.first != it.second }
    }*/
    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length != rightStrand.length)
            throw IllegalArgumentException("left and right strands must be of equal length")

        var differences: Int = 0
        for (i in 0 until leftStrand.length) {
            if (leftStrand[i] != rightStrand[i])
                differences++
        }

        return differences
    }
}
