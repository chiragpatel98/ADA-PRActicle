
import java.util.ArrayList;
import java.util.Collections;

class Job{
	
	char id;
	int deadline,profit;
	public Job(char id, int deadline, int profit){
		this.id=id;
		this.deadline=deadline;
		this.profit=profit;
	}
	
	public Job() {
		
	}

	void printJob(ArrayList<Job> arr, int t){
		int n=arr.size();
		Collections.sort(arr,(a,b)->b.profit - a.profit);
		boolean result[] =new boolean[t];
		char job[]=new char[t];
		for(int i=0; i<n;i++){
			for(int j=Math.min(t-1, arr.get(i).deadline-1); j>=0; j--){
				if(result[j]==false){
					result[j]=true;
					job[j]=arr.get(i).id;
					break;
					}
			}
		}
		
		for(char jb:job){
			System.out.print(jb+ " ");
		}
		System.out.println();
	}
	
}


public class JobScheduling {

	public static void main(String[] args) {
		Job ob=new Job();
		ArrayList<Job> arr=new ArrayList<Job>();
		arr.add(new Job('A',4,20));
		arr.add(new Job('B',1,10));
		arr.add(new Job('C',1,40));
		arr.add(new Job('D',1,30));
		System.out.println("Following is maximum " + " profit sequence of jobs");
		ob.printJob(arr,3);
	}

}