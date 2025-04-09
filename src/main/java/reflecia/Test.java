package reflecia;

public class Test {
    private String value;

    private Test(String value) {
        this.value = value;
    }

    public Test() {}


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return "Test {value='" + value + "'}";
    }
}
