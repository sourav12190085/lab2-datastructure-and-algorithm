public class que {
    int size = 0;
    int max = 10;
    int first = 0;
    int rear;
    int quee[]=new int[max];
    
    // This is mainly for returning the length of the element. 
    public int size(){
        return size;
    }
    // This is mainly for seeing that if the que is empty or not.
    public boolean isEmpty(){
        if(size == 0){
            return true;

        }
        else{
            return false;
        }
    }
    // this code is for enqueing the que.
    public void enquee(int e){
        if(rear==max){
			System.out.println("Sorry i am full now");
		}
		else{
            quee[rear]=e;
            rear++;
            System.out.println("The element is "+e);

		}
		size=size+1;
	}
    // This code is for dequeing the que.
    public void dequee(){
        if(rear==first){
			System.out.println("Sorry the queue is empty");
		}
		else{
            int e=quee[first--];
            System.out.println("The dequeed element is "+e);
			
        }
        size=size-1;
		
	}
	// This is mainly for returning the first value 
    public int first(){
        if (first==-1){
			return 0;
        }
        else{
        return quee[first];
        }
    } 
    public static void main(String[] args){
        que obj = new que();
        obj.enquee(1);
        obj.enquee(2);
        obj.enquee(3);
        obj.enquee(4);
        obj.enquee(5);
        obj.dequee();
        System.out.println("The first element is "+obj.first());
        System.out.println("the size of arr is :"+obj.size());
        System.out.println("the value of isEmpty is:"+obj.isEmpty());
        System.out.println("hippip hurray everything is working fine madam.");



    }
    
}
