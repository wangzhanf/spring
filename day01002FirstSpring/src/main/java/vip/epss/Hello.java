package vip.epss;

public class Hello {
    private String messsage;

    public Hello() {
    }

    public Hello(String messsage) {
        this.messsage = messsage;
    }

    public String getMesssage() {
        return messsage;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "messsage='" + messsage + '\'' +
                '}';
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }
}
