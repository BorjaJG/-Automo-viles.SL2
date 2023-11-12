public class Vehicle {


    private String vehicleRegistration;
    private String brand;
    private String color;
    private String fuel;
    private String engine;
    private String horser;

    private Boolean vendido;

    public Boolean getVendido() {
        return vendido;
    }

    public void setVendido(Boolean vendido) {
        this.vendido = vendido;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getHorser() {
        return horser;
    }

    public void setHorser(String horser) {
        this.horser = horser;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleRegistration='" + vehicleRegistration + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                ", engine='" + engine + '\'' +
                ", horser='" + horser + '\'' +
                '}';
    }
}
