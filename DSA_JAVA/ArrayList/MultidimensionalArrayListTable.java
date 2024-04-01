import java.util.ArrayList;

public class MultidimensionalArrayListTable{
    public static void main(String[] args) {
        
        ArrayList <Integer> mainList=new ArrayList<>();

        ArrayList <Integer> list1=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(2*i);
        }
        mainList.add(list1);

        ArrayList <Integer> list2=new ArrayList<>();
        for(int j=1;j<=5;j++){
            list2.add(2*j);
        }
        mainList.add(list2);

        ArrayList <Integer> list3=new ArrayList<>();
        for(int k=1;k<=5;k++){
            list3.add(2*k);
        }

        mainList.add(list3);

        System.out.println(mainList);

    }
}