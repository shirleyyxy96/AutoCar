package exception;

import lombok.Data;

/**
 * @author yixiaoying@geostar.com
 * @date 2020/5/29 15:58
 */
public class CarParkOfBoundsException extends Exception {
    public CarParkOfBoundsException(){
        super();
    }
    public CarParkOfBoundsException(String message){
        super(message);
    }
}
