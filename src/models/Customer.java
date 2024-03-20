package models;

public class Customer {
    private String fio;
    private String city;
    private String number;
    private String street;
    private String houseNum;
    private int flatNum;
    private int floor;
    private  String inn;

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public int getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(int flatNum) {
        this.flatNum = flatNum;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return  "ФИО:" + fio +
                "\tГород:" + city  +
                "\tНомер телефона:" + number +
                "\tУлица:" + street +
                "\tНомер дома:" + houseNum +
                "\tНомер квартиры:" + flatNum +
                "\tЭтаж:" + floor ;
    }
}
