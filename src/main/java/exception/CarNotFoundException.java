package exception;

import lombok.Data;

/**
 * @author yixiaoying@geostar.com
 * @date 2020/5/29 15:56
 */
public class CarNotFoundException extends Exception {
    public CarNotFoundException(){
        super();
    }
    public CarNotFoundException(String message){
        super(message);
    }
}
