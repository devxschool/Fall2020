package enums;

public enum  TaxMaritalStatus {
    SINGLE("single"),
    MARRIED("married"),
    MARRIED_FILE_AS_SINGLE("married-file-as-single");

    private final String value;

    TaxMaritalStatus(String value){
        this.value = value;
    }

    public String getValue(){
         return value;
    }
}
