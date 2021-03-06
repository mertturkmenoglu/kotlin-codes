package collections.set.e002_HashSet

fun main() {
    val hashSet = HashSet<Int>(5)

    hashSet.addAll(listOf(1, 2, 3, 4, 5))
    println(hashSet)

    val names = hashSetOf("Rose", "Martha", "Donna", "Amy", "Clara")
    println(names)

    println(names.contains("Rory"))
    println(names.isEmpty())

    val iterator = names.iterator()
    while (iterator.hasNext()) {
        print(iterator.next())
        print('\t')
    }

    println()

    names.remove("Clara")
    println(names)
    names.clear()
    println(names)

}