package handson2;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
