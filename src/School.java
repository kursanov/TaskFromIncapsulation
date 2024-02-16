import enums.Status;

public class School {


    private String names;

    private Status status;

    private  String address;


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "names='" + names + '\'' +
                ", status=" + status +
                ", address='" + address + '\'' +
                '}';
    }
}
