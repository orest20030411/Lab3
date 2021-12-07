package task1;

enum ResponseCodes {
    ERROR5("Code 500"), ERROR4("Code 400"),  ERROR2("Code 200");

    private final String code;

    ResponseCodes(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}


