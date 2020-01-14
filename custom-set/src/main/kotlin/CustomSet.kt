class CustomSet(vararg setValues: Any?) {

    var set = setValues.toMutableSet()

    fun isEmpty(): Boolean = set.isEmpty()

    fun isSubset(other: CustomSet): Boolean = other.set.containsAll(set)


    fun isDisjoint(other: CustomSet): Boolean = (set.intersect(other.set)).isEmpty()

    fun contains(other: Int): Boolean = set.contains(other)

    fun intersection(other: CustomSet): CustomSet {
        val newSet = set.intersect(other.set)
        return CustomSet(*newSet.toTypedArray())
    }

    fun add(other: Int) {
        set.add(other)
    }

    override fun equals(other: Any?): Boolean = when(other) {
        is CustomSet -> set == other.set
        else -> false
    }

    operator fun plus(other: CustomSet): CustomSet {
        val newSet = set.union(other.set)
        return CustomSet(*newSet.toTypedArray())
    }

    operator fun minus(other: CustomSet): CustomSet {
        val newSet = set.subtract(other.set)
        return CustomSet(*newSet.toTypedArray())
    }
}
