package wordCounter.services

import groovy.test.GroovyTestCase
import static wordCounter.services.FileReader.readFileToString
import wordCounter.exceptions.NoFileException

class FileReaderTest extends GroovyTestCase {
    void testReadsTxtFileToString() {
        String text = readFileToString("./src/test/groovy/wordCounter/files/test.txt")

        String expected = "Text from a file"

        assert text == expected
    }
    void testReadsLargeTxtFileToString() {
        String text = readFileToString("./src/test/groovy/wordCounter/files/largeTest.txt")

        String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non sodales neque sodales ut. Gravida arcu ac tortor dignissim convallis aenean et tortor. Ultricies mi eget mauris pharetra et ultrices neque. Vel eros donec ac odio tempor orci.\n" +
                "Tellus in metus vulputate eu scelerisque felis. Volutpat diam ut venenatis tellus in metus vulputate eu. Tempor id eu nisl nunc mi ipsum faucibus vitae. Sit amet luctus venenatis lectus magna fringilla urna. Habitant morbi tristique senectus et netus et. Eget felis eget nunc lobortis. Neque vitae tempus quam pellentesque nec.\n" +
                "Pellentesque nec nam aliquam sem et tortor consequat id porta. Eget dolor morbi non arcu risus quis. Lacinia quis vel eros donec. Velit laoreet id donec ultrices tincidunt arcu non sodales. Feugiat in fermentum posuere urna nec tincidunt. Tortor at risus viverra adipiscing at. In mollis nunc sed id semper. Semper eget duis at tellus at urna condimentum mattis pellentesque. Egestas purus viverra accumsan in nisl nisi scelerisque eu. A cras semper auctor neque vitae tempus quam pellentesque."

        assert text == expected
    }

    void testReadsEmptyTextFileToString() {
        String text = readFileToString("./src/test/groovy/wordCounter/files/empty.txt")

        String expected = ""

        assert text == expected
    }

    void testThrowsExceptionIfFileNotExist() {
        try {
            def result = readFileToString("./src/test/groovy/wordCounter/files/doesNotExist.txt")
            assert true == false // Should not hit this
        } catch (NoFileException exception) {
            NoFileException expected = new NoFileException("./src/test/groovy/wordCounter/files/doesNotExist.txt cannot be found", "WC.NF.1")

            assert exception.message == expected.message
        }
    }
}

