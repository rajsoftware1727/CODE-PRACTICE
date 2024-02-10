package CollectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class CollectionsDemo {
	
	public static void main(String args[])
	{
		/*
		 *  List is an interface  and implemented classes are LinkedList , ArrayList , Vector , Stack
		 */
		
		/*List l=new ArrayList();
		l.add("rajesh");
		l.add(123);
		l.add('a');
		l.add(2.45f);
		for(Object s:l)
		{
			System.out.println(s);
		}
		
		Stack s=new Stack();
		s.add("raj");
		s.add('m');
		for(Object g:s)
		{
			System.out.println(s.get(0));
		}*/
		
		// Queue and DeQueue-----priority Queue and ArrayDeQueue
		
		PriorityQueue<String> p=new PriorityQueue<String>();
		
		p.add("raj");
		p.add("aki");
		System.out.println(p.size()+" "+p.peek()+p.poll());
		Iterator r=p.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		 
		Map<String,Integer> g=new HashMap<String,Integer>();
		g.put("r",110);
		g.put("a",120);
		 System.out.println(g.get("r"));
		 
		
	}

}
