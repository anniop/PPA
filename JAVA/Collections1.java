// Linked List
import java.util.*;

class Collections1 
{
    public static void main(String[] Google)
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println(lobj);
        lobj.addFirst(5);
        lobj.addLast(007);
        System.out.println(lobj);

        Iterator iobj = lobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        lobj.clear();
        
    }
}
