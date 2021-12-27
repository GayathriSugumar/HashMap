package Hashmap;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private Integer id;
    private String name;
    private String city;

    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Map<Integer, Employee> employeesMap = new HashMap<>();
        employeesMap.put(101, new Employee(101, "Gayathri", "Thanjavur"));
        employeesMap.put(102, new Employee(102, "Ragini", "Perambalur"));
        employeesMap.put(103, new Employee(103, "Uma", "Thiruvarur"));
        employeesMap.put(103, new Employee(104, "Mami", "Mailaduthurai"));

        System.out.println(employeesMap);
    }
    
}
