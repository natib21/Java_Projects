package Section_5.Composition;

public class ComputerFactory {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,"2540 X 1440");
        Motherboared theMotherBoard = new Motherboared("BJ-200","Asus",4 ,6,"v2.44" );


        PersonalComputer thePc = new PersonalComputer("2208", "Dell",theCase,theMonitor,theMotherBoard);

//        thePc.getMonitor().drawPixelAt(10,10,"red");
//
//        thePc.getMotherboared().loadProgram("Windows OS");
//
//        thePc.getComputerCase().pressPowerButton();

        thePc.powerUP();
    }
}
