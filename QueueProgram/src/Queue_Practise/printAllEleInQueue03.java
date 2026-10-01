package Queue_Practise;

import java.util.LinkedList;
import java.util.Queue;

/* Print all the elements present in given queue 
only using add() , remove() , peek() , size() and 
extra queue.
*/

public class printAllEleInQueue03 {

	public static void main(String[] args) {
		  Queue<Integer> que = new LinkedList<>();
		  que.add(1);
		  que.add(2);
		  que.add(3);
		  que.add(4);
		  que.add(5);
		  
		  Queue<Integer> helper =  new LinkedList<>();
		  while(!que.isEmpty()) {
			  System.out.print(que.peek()+" ");
			  helper.add(que.remove());
		  }
		  while(helper.size()>0) {
			  que.add(helper.remove());
		  }
		  
	}

}
