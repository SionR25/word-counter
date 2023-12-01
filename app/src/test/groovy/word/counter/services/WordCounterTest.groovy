package word.counter.services

import groovy.test.GroovyTestCase

class WordCounterTest extends GroovyTestCase {
    void testReturnCountOfAllWordsInString() {
        def result = countWords("How How How to to test")

        def expected = [how: 3, to: 2, test: 1]

        assertSame(result, expected)
    }

    void testReturnsCountOfOneWordString() {
        def result = countWords("Test")

        def expected = [test: 1]

        assertSame(result, expected)
    }

    void testReturnsEmptyMapFromEmptyString() {
        def result = countWords("")

        def expected = [:]

        assertSame(result, expected)
    }
}
