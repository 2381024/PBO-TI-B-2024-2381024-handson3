package handson1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = {"Apel","Pisang","Mangga","Jeruk","Durian","Anggur"};
        int counter = 0;
        while(counter < kumpulanBuah.length){
            System.out.println("Element ke "+(counter+1)+" Adalah: " +kumpulanBuah[counter]);
        }
    }
}
