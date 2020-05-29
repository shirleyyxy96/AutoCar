package domian;

import lombok.Data;

/**
 * @author yixiaoying@geostar.com
 * @date 2020/5/28 15:44
 */
public class AutoCar {

    private CarPark carPark;

    private int positionX;

    private int positionY;

    private Orientation orientation;

    public CarPark getCarPark() {
        return carPark;
    }

    public void setCarPark(CarPark carPark) {
        this.carPark = carPark;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public AutoCar(int positionX, int positionY, Orientation orientation) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.orientation = orientation;
    }

    public AutoCar(CarPark carPark, int positionX, int positionY, Orientation orientation) {
        this.carPark = carPark;
        this.positionX = positionX;
        this.positionY = positionY;
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return "X: " + positionX + "," + "Y: " + positionY +  "," + "orientation:" +orientation;
    }
}
