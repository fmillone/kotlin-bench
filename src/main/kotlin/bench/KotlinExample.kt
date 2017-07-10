package bench

import java.io.File

/**
 * Created by francisco.millone on 26/6/2017.
 */
fun countDamage(inputFilePath: String): Int {
    val inputF = File(inputFilePath)
    return inputF.bufferedReader()
            .lineSequence()
            .filter { it.split(',')[5] == "CRIMINAL DAMAGE" }
            .count()

}


fun countDamage2(inputFilePath: String): Long {
    val inputF = File(inputFilePath)
    return inputF.bufferedReader()
            .lines()
            .filter { it.split(',')[5] == "CRIMINAL DAMAGE" }
            .count()

}