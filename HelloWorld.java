package Scrap;

public class HelloWorld {

    private static int result=0;
    public static void main(String[] args) {

        System.out.println("Hello World!");

        String whatToDO = "let's do some calculations";
        System.out.println(whatToDO);
        
        int x=137;
        int y=14;
        result=x+y;
        System.out.println(x+"+"+y+"="+HelloWorld.getResult());
        
    }

    private static int getResult() { return result; }

}