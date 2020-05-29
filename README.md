"# AutoCar" 

###     环境搭建

* jdk1.8

* maven

  ### 示例代码

  `

  ```java
  CarPark carPark = new CarPark("company park", 4, 4);AutoCar exampleOne = new AutoCar(carPark, 1, 1, Orientation.NORTH);AutoCar exampleTwo = new AutoCar(carPark, 1, 1, Orientation.NORTH);AutoCar exampleThree = new AutoCar(carPark, 1, 1, Orientation.EAST);AutoCar exampleFour = new AutoCar(carPark, 1, 1, Orientation.WEST);AutoCar exampleFive = new AutoCar(carPark, 1, 1, Orientation.EAST);try {    CarUtils.changeOrientation(exampleOne, CarSteer.RIGHT, 1);    System.out.println(exampleOne);    CarUtils.move(exampleTwo, 1);    System.out.println(exampleTwo);    CarUtils.move(exampleThree, 1);    System.out.println(exampleThree);    CarUtils.move(exampleFive, 2);    System.out.println(exampleFive);    CarUtils.move(exampleFour, 1);    System.out.println(exampleFour);} catch (Exception e) {    e.printStackTrace();}
  ```

  `

  