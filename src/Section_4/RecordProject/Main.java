package Section_4.RecordProject;

public class Main {
    public static void main(String[] args) {

        for(int i =1 ; i<= 5; i++){
            LPAStudent s = new LPAStudent("S92300"+i,switch(i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";

            }, "05/11/1985", "Java MasterCalss");
          System.out.println(s);
        }

        Student pojo = new Student("S212","Piter","06/11/1943","Java Master Class");
        LPAStudent LPA = new LPAStudent("S000","Nati","02/12/1996","Java Master Class");

         pojo.setClassList(pojo.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojo.getClassList());
        System.out.println(LPA.classList());
        System.out.println(pojo);
        System.out.println(LPA);
    }
}
