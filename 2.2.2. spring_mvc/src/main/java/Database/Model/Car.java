package Database.Model;

public class Car {

    private int series;
    private String model;
    private String type;

    public Car(){

    }

    public Car(int series, String model, String type){
        this.series = series;
        this.model = model;
        this.type = type;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
