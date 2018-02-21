package Exersice11_7;

/*
 Write a method countCommon that accepts two lists of integers as parameters and returns
 the number of unique integers that occur in both lists. Use one or more sets as storage to help you solve this problem.
 For example, if one list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values
 [–5, 15, 2, –1, 7, 15, 36], your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists.
 */

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Run
{
    public static void main(String[] args)
    {
        LinkedList<Integer> startList1 = new LinkedList<Integer>();
        startList1.add(3);
        startList1.add(7);
        startList1.add(3);
        startList1.add(-1);
        startList1.add(2);
        startList1.add(3);
        startList1.add(7);
        startList1.add(2);
        startList1.add(15);
        startList1.add(15);

        LinkedList<Integer> startList2 = new LinkedList<Integer>();
        startList2.add(-5);
        startList2.add(15);
        startList2.add(2);
        startList2.add(-1);
        startList2.add(7);
        startList2.add(15);
        startList2.add(36);

        System.out.println(countCommon(startList1,startList2));

    }



    public static int countCommon (LinkedList<Integer> list1, LinkedList<Integer> list2 )
    {
        Set<Integer> endset1 = new TreeSet<>();
        Set<Integer> endset2 = new TreeSet<>();

        endset1.addAll(list1);
        endset2.addAll(list2);

        endset1.retainAll(endset2);


        return endset1.size();
    }

}
