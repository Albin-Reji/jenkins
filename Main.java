import java.util.Date;

class Main {
    public static void main(String[] args) {
        System.out.println("This is Java Main class ");
        System.out.println("test: jenkin pipeline");
        System.err.println(new Date());
        getJenkins();
        Init init=new Init("Albin");
        System.err.println(init.getName());
    }
    public static void getJenkins(){
        System.out.println("Jenkin Project Executed...");
    }
}