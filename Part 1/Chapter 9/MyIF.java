public interface MyIF {
    // this is the standard interface method declaration
    int getNumber();

    // this is a default method implementation
    default String getString() {
        return "Default String";
    }

    default String getString2() {
        return "Default String";
    }
}
