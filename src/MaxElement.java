/*
Author : Hazem Ahmed
Date : 23/2/2019
 */
import java.util.Scanner;
import java.util.ArrayList;

public class MaxElement {
    public static void main(String[]args)
    {
        ArrayList<Integer> List = new ArrayList<Integer>();

        Scanner in=new Scanner(System.in);
        System.out.println("Enter A Sequence Of Numbers Ending With 0");
        int num=in.nextInt();

         while(num!=0)
        {
            List.add(num);
            num=in.nextInt();
        }
        System.out.println(max(List));
    }
    public static Integer max(ArrayList<Integer> list)
    {
        int max=0;
        for(int i=0;i<list.size();i++)
        {
        if(max<list.get(i))
        {
            max = list.get(i);
        }
        }
        return max;
    }
}
