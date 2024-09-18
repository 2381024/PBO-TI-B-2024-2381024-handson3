package handson2;

public class ForEach {
    public static void main(String[] args) {
        int[] angka = new int[21];
        for(int i = 0; i <= 20; i++){
            angka[i] = i;
        }

        for(int x : angka){
            if(x == 0){
                continue;
            }
            if(x % 2 == 1){
                continue;
            }
            System.out.println(x);
        }
    }
}
