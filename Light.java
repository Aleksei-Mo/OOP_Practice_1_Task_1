public class Light {
    private Boolean status;

    public void switchOn() {
        this.status = true;
        System.out.println("Освещение включено.");
    }

    public void switchOff() {
        this.status = false;
        System.out.println("Освещение выключено.");
    }

    public Boolean getStatus() {
        return status;
    }
}
