/* Unfinished Loop - Bug Fixing #1
Oh no, Timmy's created an infinite loop!
Help Timmy find and fix the bug in his unfinished For Loop!

https://www.codewars.com/kata/unfinished-loop-bug-fixing-number-1/java

*/

import java.util.*;

public class UnfinishedLoopBugFixing1 {

    public static List CreateList(int number)
    {
        List list = new ArrayList<>();

        for(int count = 1; count <= number; count++) // added coint++ to this line to fix the infinite loop

        {
            list.add(count);
        }

        return list;
    }
}
