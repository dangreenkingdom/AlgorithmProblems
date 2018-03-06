/*
Design and implement a TwoSum class. It should support the following operations:add and find.

add - Add the number to an internal data structure.
find - Find if there exists any pair of numbers which sum is equal to the value.

For example,
add(1); add(3); add(5);
find(4) -> true
find(7) -> false
*/

import java.util.HashSet;
public class MyClass {
    public static void main(String args[]) {
        TowSum test = new TowSum();
        test.add(1);
        test.add(3);
        test.add(5);
        System.out.println(test.find(4));
        System.out.println(test.find(5));
    }
    
}

class TowSum {
    HashSet<Integer> set = new HashSet<Integer>();
    public void add(Integer i) { set.add(i); }
    public boolean find(Integer t) {
        for( Integer i : set) {
            if (set.contains(t-i))
                return true;
        }
        return false;
    }
}
