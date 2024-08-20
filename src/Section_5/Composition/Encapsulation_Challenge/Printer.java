package Section_5.Composition.Encapsulation_Challenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;



    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100)?tonerLevel:-1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
      int tempAmount = tonerAmount + tonerLevel;
       if(tempAmount > 100 || tempAmount < 0){
           return  -1;
       }
        tonerLevel = tonerAmount + tonerLevel;
       return tonerLevel;
    }
    public int printPage(int pages){
     int jobPages = (duplex) ? (pages /2 ) + (pages % 2) : pages;
     pagesPrinted += jobPages;
     return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
