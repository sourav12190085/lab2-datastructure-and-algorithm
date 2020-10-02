public class STK{
    // initializing some values to the variables that is being created
    int max=10;
    int top=0;
    int size=0;
    int arr[]=new int[max];
    public int size(){
        return size;
    }
    // This is for looking if the stack is empty or not 
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        else{
        return false;
        }
    }
    //This method is for push
    public void push(int e){
    if (top>max){
    System.out.println("stack is overflown, you can not do that");
    }
    else{
    arr[++top]=e;
    System.out.println(e);
    }
    size=size+1;
    }
    // This method is for pop
    public void pop(){
    if (top <= 0){
    System.out.println("stack is underflownm, add some elements");
    }
    else
    {
    int e = arr[top--];
    System.out.println(e +" is the poped element of my stack");
     
    }
    size=size-1;
}
    // Printing the top element

    public void top(){
        int a = arr[top];
        System.out.println("The top element is of my stack is "+ a);

    }




    public static void main(String[] args){
        STK obj= new STK();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.pop();
        obj.top();
        System.out.println("the size of arr is :"+obj.size());
        System.out.println("the value of isEmpty is:"+obj.isEmpty());
        System.out.println("hippip hurray everything is working fine madam.");

    }    
    
}


