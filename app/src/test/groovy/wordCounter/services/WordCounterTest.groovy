package wordCounter.services

import groovy.test.GroovyTestCase

import static wordCounter.services.WordCounter.countWords

class WordCounterTest extends GroovyTestCase {
    void testReturnCountOfAllWordsInString() {
        def result = countWords("How How How to to test")

        Map<String,Integer> expected = [how: 3, to: 2, test: 1]

        assert result == (expected)
    }

    void testReturnCountWhenWordsJumbled() {
        def result = countWords("How to test how to how")

        Map<String,Integer> expected = [how: 3, to: 2, test: 1]

        assert result == (expected)
    }

    void testReturnsCountOfOneWordString() {
        def result = countWords("Test")

        Map<String,Integer> expected = [test: 1]

        assert result == (expected)
    }

    void testReturnsEmptyMapFromEmptyString() {
        def result = countWords("")

        Map<String,Integer> expected = [:]

        assert result == (expected)
    }
}
