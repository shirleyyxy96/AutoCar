package exception;

import lombok.Data;

/**
 * @author yixiaoying@geostar.com
 * @date 2020/5/29 15:58
 */
public class CarNotInParkException extends Exception {
    public CarNotInParkException(){
        super();
    }
    public CarNotInParkException(String message){
        super(message);
    }
}
