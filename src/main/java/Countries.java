public class Countries {
    private String countryName;
    private String city;
    private boolean travelGoal;

    public Countries(String name, String city, boolean travelGoal) {
        this.countryName = name;
        this.city = city;
        this.travelGoal = travelGoal;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isTravelGoal() {
        return travelGoal;
    }

    public void setTravelGoal(boolean travelGoal) {
        this.travelGoal = travelGoal;
    }
}