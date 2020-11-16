package HomeWork_16_11_2020_StreamAPI;

public class Artist {
    public String name;
    public Country country;
    public Type type;

    public Artist(String name, Country country, Type type) {
        this.name = name;
        this.country = country;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "{" +
                "name = " + name + '\'' +
                ", country = " + country +
                ", type = " + type +
                '}';
    }

}
