//{ Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}


// } Driver Code Ends

class Activity{
    private int startTime;
    private int endTime;

    public Activity(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public Activity setStartTime(int startTime) {
        this.startTime = startTime;
        return this;
    }

    public int getEndTime() {
        return endTime;
    }

    public Activity setEndTime(int endTime) {
        this.endTime = endTime;
        return this;
    }
}

class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
           PriorityQueue<Activity> activityPriorityQueue=new PriorityQueue<>(Comparator.comparing(Activity::getEndTime));
         for (int i=0;i<start.length;i++)
        {
            Activity activity=new Activity(start[i],end[i]);
            activityPriorityQueue.add(activity);
        }
        int endTime=activityPriorityQueue.poll().getEndTime();
        int count=1;
        while (!activityPriorityQueue.isEmpty())
        {
           Activity activity=activityPriorityQueue.poll();
           if(activity.getStartTime()>endTime)
              { count++;
                endTime=activity.getEndTime();
              }
        }
        return count;
    }
}