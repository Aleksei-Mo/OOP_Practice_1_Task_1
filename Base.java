public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private Light light;
    private Conditioner conditioner;

    public Base() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
        light = new Light();
        conditioner = new Conditioner();
    }

    public void lightOn() {
        light.switchOn();
    }

    public void lightOff() {
        light.switchOff();
    }

    public void start() {
        engine.start();
    }

    public void drive() {
        if (engine.getWork()) {
            transmission.switchGear(1);
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
        }
    }

    public void stop() {
        engine.stop();
    }

}
