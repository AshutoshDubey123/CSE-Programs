import java.util.ArrayList;

public class MultidimensionalArrayListTable{
    public static void main(String[] args) {
        
        ArrayList <ArrayList<Integer>> mainList=new ArrayList<>();

        ArrayList <Integer> list1=new ArrayList<>();
        ArrayList <Integer> list2=new ArrayList<>();
        ArrayList <Integer> list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);//1,2,3,4,5
            list2.add(i*2);//2,4,8,10
            list3.add(i*3);//3,6,9,12,15
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);//[[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]

        for(int i=0;i<mainList.size();i++){//accesses mainList
            ArrayList<Integer>currentList=mainList.get(i);//this gives full ith list
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();//to separate each ArrayList through new line 
        }

    }
}
/*Output: 
[[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
 */