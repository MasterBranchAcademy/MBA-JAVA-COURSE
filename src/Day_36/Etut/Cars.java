package Day_36.Etut;

public class Cars {

    private String carName;

    public Cars(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
