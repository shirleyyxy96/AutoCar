package domian;

import lombok.Data;

/**
 * @author yixiaoying@geostar.com
 * @date 2020/5/28 16:36
 */
public enum Orientation {
    NORTH(1, "NORTH"),
    EAST(2, "EAST"),
    SOUTH(3, "SOUTH"),
    WEST(4, "WEST");

    int code;
    String name;

    Orientation(int code, String name) {
        this.code = code;
        this.name = name;
    }
    

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
