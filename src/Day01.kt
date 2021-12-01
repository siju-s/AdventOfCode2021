fun main() {
    val input = readInput("Day01")
    println("Input size:${input.size}")
    println("Part 1 soln: ${part1(input.map { it.toInt() })}")
    println("Part 2 soln: ${part2(input.map { it.toInt() })}")
}

private fun part1(inputList: List<Int>): Int {
    return inputList.windowed(2).count { it[1] > it[0] }
}

private fun part2(inputList: List<Int>): Int {
    return inputList.windowed(3).map { it.sum() }.windowed(2).count { it[1] > it[0] }
}


