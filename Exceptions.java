package HW_3;

class CountFieldException extends Exception {
    public CountFieldException(String message) {
        super("Количество полей " + message + " чем требуется!");
    }
}

class TypeDataExceptoin extends Exception {
    public TypeDataExceptoin(int index) {
        super("У поля " + (index + 1) + " не корректный тип!");
    }
}

class FormatException extends Exception {
    public FormatException() {
        super("Не правильный формат телефона!");
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}