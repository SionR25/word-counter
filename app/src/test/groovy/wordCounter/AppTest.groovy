/*
 * Integration tests for the Word Counter CLI application
 */
package wordCounter

import groovy.test.GroovyTestCase

class AppTest extends GroovyTestCase {
    void testAppReturnsCountSmallText() {
        // Capture system out
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        // Act
        App.main("./src/test/groovy/wordCounter/files/test.txt")

        // Assert
        String expected = "text: 1\nfrom: 1\na: 1\nfile: 1\n"
        assert buffer.toString() == expected
    }

    void testAppReturnsCountLargeText() {
        // Capture system out
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        // Act
        App.main("./src/test/groovy/wordCounter/files/largeTest.txt")

        // Assert
        String expected = "et: 6\neget: 5\nin: 5\nneque: 4\ntortor: 4\neu: 4\nid: 4\nat: 4\ntempor: 3\nut: 3\nnon: 3\n" +
                "sodales: 3\narcu: 3\ndonec: 3\nnunc: 3\nvitae: 3\nurna: 3\npellentesque: 3\nsemper: 3\nipsum: 2\n" +
                "dolor: 2\nsit: 2\namet: 2\nadipiscing: 2\nsed: 2\nmagna: 2\nac: 2\nmi: 2\nultrices: 2\nvel: 2\neros: 2\n" +
                "metus: 2\nvulputate: 2\nscelerisque: 2\nfelis: 2\nvenenatis: 2\ntellus: 2\nnisl: 2\nmorbi: 2\ntempus: 2\n" +
                "quam: 2\nnec: 2\nrisus: 2\nquis: 2\ntincidunt: 2\nviverra: 2\nlorem: 1\nconsectetur: 1\nelit: 1\ndo: 1\n" +
                "eiusmod: 1\nincididunt: 1\nlabore: 1\ndolore: 1\naliqua: 1\ngravida: 1\ndignissim: 1\nconvallis: 1\n" +
                "aenean: 1\nultricies: 1\nmauris: 1\npharetra: 1\nodio: 1\norcitellus: 1\nvolutpat: 1\ndiam: 1\n" +
                "faucibus: 1\nluctus: 1\nlectus: 1\nfringilla: 1\nhabitant: 1\ntristique: 1\nsenectus: 1\nnetus: 1\n" +
                "lobortis: 1\nnecpellentesque: 1\nnam: 1\naliquam: 1\nsem: 1\nconsequat: 1\nporta: 1\nlacinia: 1\n" +
                "velit: 1\nlaoreet: 1\nfeugiat: 1\nfermentum: 1\nposuere: 1\nmollis: 1\nduis: 1\ncondimentum: 1\n" +
                "mattis: 1\negestas: 1\npurus: 1\naccumsan: 1\nnisi: 1\na: 1\ncras: 1\nauctor: 1\n"
        assert buffer.toString() == expected
    }

    void testReturnsMessageNoArgs() {
        // Capture system out
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        // Act
        App.main()

        // Assert
        String expected = "No file path supplied, please re-run and give relative filepath as CLI arg"
        assert buffer.toString() == expected
    }

    void testReturnsMessageTooManyArgs() {
        // Capture system out
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        // Act
        App.main()

        // Assert
        String expected = "To many args supplied, please re-run with only one filepath supplied"
        assert buffer.toString() == expected
    }
}
