public class SmartPhone{
    final static String shape = "Rectangle";
    final static String frontCamera = "center";
    ProcessorType processor;
    String name;
    int price =500000;






    public static void main(String[] args) {


        SmartPhone smartphone = new SmartPhone();

        smartphone.name = "Samsung";
        System.out.println(smartphone.name);
        System.out.println(smartphone.price);
        System.out.println(smartphone.shape);
        smartphone.processor =ProcessorType.INTEL;
        System.out.println(smartphone.processor);
        String result1 = "Quaed9";
        boolean finalResult = result1.equals(smartphone.processor.getVlaue());
        System.out.println(finalResult);
        System.out.println("____________________________________");

        Notebook notebook = new Notebook();
        notebook.cost = 30;
        System.out.println(notebook.cost);
        System.out.println(notebook.cover);
        System.out.println(Notebook.noOfEdges);
     String result2 = "soft_tshh";
     boolean finalvalue = result2.equals(notebook.cover.getVlaue());
     System.out.println(finalvalue);
    }



    public enum ProcessorType {
        QUAED9("quaed9"), QUAED7("quaed7");
        String result;

        ProcessorType(String result){
        this.result = result;

    }
    public String getValue(){

        return this.result;
    }
    }    
}
class Notebook{
    final static int noOfEdges = 4;
    final static String usedFor= "Writing";
    String  bookName = "Classmate";
    int cost;
    CoverType cover = CoverType.SOFT_COVER;





    public enum CoverType {
        HARD_COVER("hard_cover"), SOFT_COVER("soft_cover"), SPIRAL("spiral");
        String value;



    CoverType(String value){
        this.value = value;

    }
    public String getVlaue(){

        return this.value;
	}
}
}