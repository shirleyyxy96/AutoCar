package domian;

import lombok.Data;

/**
 * @author yixiaoying@geostar.com
 * @date 2020/5/29 15:36
 */
public class CarPark {
    private String name;

    private  int xAxis;

    private  int yAxis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public CarPark(String name, int xAxis, int yAxis) {
        this.name = name;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
}
