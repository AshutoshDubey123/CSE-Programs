import java.util.ArrayList;

public class MultidimensionalArrayList{

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        System.out.println(mainList);


        /*printing the each list separately as in pattern shown
        1 2
        3 4 
        */
        for(int i=0;i<mainList.size();i++){//accesses mainList
            ArrayList<Integer> currentList= mainList.get(i);//this gives full ith list
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j)+" ");

            }
            System.out.println();
            
        }
      
    }
}
/*
output:
[[1, 2], [3, 4]]
1 2
3 4
 */