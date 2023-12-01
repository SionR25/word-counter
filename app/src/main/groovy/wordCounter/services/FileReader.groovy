package wordCounter.services

import wordCounter.exceptions.NoFileException

static String readFileToString(String pathToFile) throws NoFileException {
    try {
        // Get current directory and then append relative path
        String currentDir = new File("").getAbsolutePath()
        File textFile = new File(currentDir + "/" + pathToFile)
        return textFile.text
    } catch (FileNotFoundException exception) {
        println(exception.message)
        throw new NoFileException("${pathToFile} cannot be found", "WC.NF.1")
    }
}

