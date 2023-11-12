import java.util.ArrayList;

public class Sale {

    private String id;
    private String dataSale;
    private Double cost;
    private ArrayList<Client> costumerData;
    private ArrayList<Vehicle> vehiculeData;
    private  ArrayList<Sale> saleData;

    public ArrayList<Sale> getSaleData() {
        return saleData;
    }

    public void setSaleData(ArrayList<Sale> saleData) {
        this.saleData = saleData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataSale() {
        return dataSale;
    }

    public void setDataSale(String dataSale) {
        this.dataSale = dataSale;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public ArrayList<Client> getCostumerData() {
        return costumerData;
    }

    public void setCostumerData(ArrayList<Client> costumerData) {
        this.costumerData = costumerData;
    }

    public ArrayList<Vehicle> getVehiculeData() {
        return vehiculeData;
    }

    public void setVehiculeData(ArrayList<Vehicle> vehiculeData) {
        this.vehiculeData = vehiculeData;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id='" + id + '\'' +
                ", dataSale='" + dataSale + '\'' +
                ", cost=" + cost +
                '}';
    }
}
