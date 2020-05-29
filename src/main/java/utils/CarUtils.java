package utils;

import domian.AutoCar;
import domian.CarPark;
import domian.CarSteer;
import domian.Orientation;
import exception.CarNotFoundException;
import exception.CarNotInParkException;
import exception.CarParkOfBoundsException;

import static domian.Orientation.*;

/**
 * @author yixiaoying@geostar.com
 * @date 2020/5/29 15:39
 */
public class CarUtils {
    private static Orientation getOrientation(int code) {
        if(code == NORTH.getCode()) {
            return NORTH;
        } else if (code == EAST.getCode()) {
            return EAST;
        } else if (code == SOUTH.getCode()) {
            return SOUTH;
        } else if (code == WEST.getCode()) {
            return WEST;
        }

        return null;
    }

    public static boolean changeOrientation(AutoCar autoCar, CarSteer carSteer, int time) throws Exception {
        if(null == autoCar) {
            throw new CarNotFoundException("car not found");
        }

        if(null == autoCar.getCarPark()) {
            throw new CarNotInParkException("car is not in park");
        }

        Orientation orientation = autoCar.getOrientation();
        int code = orientation.getCode();
        switch (carSteer) {
            case LEFT:
                code = time * 3  % 4 + orientation.getCode();
                break;
            case RIGHT:
                code = time % 4 + orientation.getCode();
                break;
        }

        autoCar.setOrientation(getOrientation(code));
        return true;
    }

    public static boolean move(AutoCar autoCar, int step) throws Exception {
        if(null == autoCar) {
            throw new CarNotFoundException("car not found");
        }

        if(null == autoCar.getCarPark()) {
            throw new CarNotInParkException("There no park for autocar to use");
        }

        Orientation orientation = autoCar.getOrientation();
        CarPark carPark = autoCar.getCarPark();
        if (null == orientation) {
            return false;
        }

        if(orientation.equals(WEST)) {
            autoCar.setPositionX(autoCar.getPositionX() - step);
            if(autoCar.getPositionX() < 1) {
                throw new CarParkOfBoundsException("car is out of boudary");
            }
        }

        if(orientation.equals(EAST)) {
            autoCar.setPositionX(autoCar.getPositionX() + step);
            if(autoCar.getPositionX() > carPark.getxAxis()) {
                throw new CarParkOfBoundsException("car is out of boudary");
            }
        }

        if(orientation.equals(NORTH)) {
            autoCar.setPositionY(autoCar.getPositionY() + step);
            if(autoCar.getPositionY() > carPark.getyAxis()) {
                throw new CarParkOfBoundsException("car is out of boudary");
            }
        }

        if(orientation.equals(SOUTH)) {
            autoCar.setPositionY(autoCar.getPositionY() - step);
            if(autoCar.getPositionY() < 1) {
                throw new CarParkOfBoundsException("car is out of boudary");
            }
        }

        return true;
    }
}
