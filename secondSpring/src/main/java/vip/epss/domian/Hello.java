package vip.epss.domian;

public class Hello {
    private String message;

    public Hello() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Hello(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "message='" + message + '\'' +
                '}';
    }
}
