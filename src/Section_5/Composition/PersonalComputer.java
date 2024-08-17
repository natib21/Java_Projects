package Section_5.Composition;

public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboared motherboared;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboared motherboared) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboared = motherboared;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }
    public void powerUP(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboared getMotherboared() {
//        return motherboared;
//    }
}
