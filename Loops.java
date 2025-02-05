public class Loops{
    public static void main(String[] args){


        String[] fruits = {"Banana", "Apple", "Strawberry"};

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        for(int x = 0; x < fruits.length; x++){
            System.out.println(fruits[x]);
        }

        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 3; j++){
                System.out.println(i + "," + j + " ");
            }
        }


    }
}