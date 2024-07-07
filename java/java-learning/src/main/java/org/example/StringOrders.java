package main.java.org.example;

public class StringOrders {

    private Integer position;

    private String code;

    public StringOrders(Integer position, String code) {
        this.position = position;
        this.code = code;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}