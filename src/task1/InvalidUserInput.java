package task1;

class InvalidUserInput extends Exception{
    public InvalidUserInput(String message, ResponseCodes code){
        super(code.getCode() + ": " + message);
    }
}

