import java.util.ArrayList;
public class ArrayListIntro_Operations{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);//O(1) just element added at end of list
        list.add(4);
        list.add(5);
        System.out.println(list);// [1, 2, 3, 4, 5]
        
        list.add(1,10);   //O(n) after adding element at a index 
        //you hava change index of later elements
        System.out.println(list);//[1, 10, 2, 3, 4, 5]

        int element=list.get(3);//O(1) just get element at a index
        System.out.println(element);

        list.remove(1);//O(n ) due to repositioning of list after deletion
        System.out.println(list);//[1, 2, 3, 4, 5]

        list.set(2,10);//O(n) you havae to reposition elements after adding an element
        System.out.println(list);//[1, 2, 10, 4, 5]

        System.out.println(list.contains(1));//true  O(n) you've search the list
        System.out.println(list.contains(11));//false

    }
}
/*output:
[1, 2, 3, 4, 5]
[1, 10, 2, 3, 4, 5]
3
[1, 2, 3, 4, 5]
[1, 2, 10, 4, 5]
true
false
 */