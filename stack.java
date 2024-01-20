public class stack {
    public int s[]=new int[10];
    int top=-1;
    public void push(int n){
        if(top==(s.length-1)){
            System.out.println("stack complete");
        }
        else{
            s[++top]=n;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("empty stack");
        }else{
            System.out.println("popped element "+s[top]);
            s[top]=0;
            top--;
        }
    }
    public void display(){
        for(int i = 0;i<s.length;i++){
            System.out.print(s[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);s.push(2);s.push(3);s.push(4);
        s.display();
        s.pop();
        s.display();
    }
}
