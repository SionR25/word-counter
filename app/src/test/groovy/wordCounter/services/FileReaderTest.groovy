package wordCounter.services

import groovy.test.GroovyTestCase

class FileReaderTest extends GroovyTestCase {
    void testReadsTxtFileToString() {
        String text = readFileToString("../files/test.txt")

        String expected = "Text from a file"

        assert text == expected
    }

    void testReadsEmptyTextFileToString() {
        String text = readFileToString("../files/empty.txt")

        String expected = ""

        assert text == expected
    }

    void testThrowsExceptionIfFileNotExist() {
        NoFileException exception = shouldFail(NoFileException, readFileToString("../files/doesNotExist.txt"))

        NoFileException expected = new NoFileException("../files/noSuchFile.txt cannot be found")

        assert exception.message == expected.message
    }
}

