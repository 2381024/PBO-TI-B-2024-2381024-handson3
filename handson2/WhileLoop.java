package handson2;

public class WhileLoop {
    public static void main(String[] args) {
        int a = 20;
        int i = 0;
        while(i < a){
            i++;
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
