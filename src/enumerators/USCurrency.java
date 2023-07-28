package enumerators;

public enum USCurrency {
    PENNY(0.01f), NICKLE(0.05f,"Nickle"),
    DIME(0.1f,"Dime"), QUARTER(0.25f,"Quarter");
    float value;
    String name;

    USCurrency(float val) {
        this.value = val;
    }

    USCurrency(float value, String name) {
        this.value = value;
        this.name = name;
    }
}
