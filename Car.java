public class Car {
    private Base base;
    //private Alarm_system alarm_system;


    public Car() {
        base = new Base();
        //alarm_system = new Alarm_system();
    }

    public void carStart() {
        base.start();
    }
    public void carStop() {
        base.stop();
    }

    public void carDrive(){
        base.drive();
    }

    public void carLightOn(){
        base.lightOn();
    }

    public void carLightOff(){
        base.lightOff();
    }
    public static void main(String[] args) {
        Car car = new Car();
        Alarm_system alarm = new Alarm_system();
        alarm.deactivated();
        car.carStart(); 
        car.carLightOn(); 
        car.carDrive();     
        car.carStop();
        alarm.activated();
        car.carLightOff();
    }
}

