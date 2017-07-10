package bench

import groovy.transform.CompileStatic

class GroovyExample {


    @CompileStatic
    Number countDamage(String filename) {
        File inputF = new File(filename)
        int lineCount = 0
        return inputF.withReader { reader ->
            String line
            while ((line = reader.readLine()) != null) {
                if (line.split(",")[5] == "CRIMINAL DAMAGE") {
                    lineCount++
                }
            }
            return lineCount
        }
    }

    Number countDamage2(String filename) {
        File inputF = new File(filename)
        int lineCount = 0
        return inputF.withReader { reader ->
            String line
            while ((line = reader.readLine()) != null) {
                if (line.split(",")[5] == "CRIMINAL DAMAGE") {
                    lineCount++
                }
            }
            return lineCount
        }
    }
}
