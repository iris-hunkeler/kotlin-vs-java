import java.util.Objects;

/**
 * Example of a POJO. Compare to data class in Kotlin.
 */
public class Person_Java {

    private String name;
    private String address;

    public Person_Java(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Person_Java other)) {
            return false;
        } else {
            return Objects.equals(name, other.name)
                    && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "model.Person [name=" + name + ", address=" + address + "]";
    }
}