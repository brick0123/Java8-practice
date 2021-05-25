package function;

import function.Address;

public class ConsumerMember {
    private String name;
    private String id;
    private Address address;

    public ConsumerMember(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
