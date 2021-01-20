package orm;


import lk.ijse.dep.orm.annotaion.Column;
import lk.ijse.dep.orm.annotaion.Entity;
import lk.ijse.dep.orm.annotaion.Id;

@Entity
public class Customer {
    @Column(name = "id")
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

