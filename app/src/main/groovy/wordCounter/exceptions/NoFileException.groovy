package wordCounter.exceptions

class NoFileException extends Exception {
    // Have always used error codes to help with identifying errors
    String errorCode

    NoFileException(String message, String errorCode) {
        super(message)
        this.errorCode = errorCode
    }
}
