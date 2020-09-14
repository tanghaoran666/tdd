public class EmptyStringsException extends Exception {
    @Override
    public String getMessage() {
        return "Strings is empty";
    }
}
