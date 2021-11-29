
public class Task0 {

    public int index;
    public String country;
    public String city;
    public String street;
    public int houseNumber;
    public String apartment;

    public static void main(String[] args) {
        Task0 addres = new Task0();
        addres.index = 41500;
        addres.city = "Kiev";
        addres.street = "Kirova";
        addres.houseNumber = 10;
        addres.apartment = "Lux";
        System.out.print("Hello I live in " + addres.city);
        System.out.println(" ,on a street " + addres.street);
        System.out.print("My index number is " + addres.index);
        System.out.println(" ,and house number " + addres.houseNumber);
        System.out.println("In apartment " + addres.apartment);
    }

    public Task0() {
    }

    public Task0(int index, String country, String city, String street, int houseNumber, String apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
