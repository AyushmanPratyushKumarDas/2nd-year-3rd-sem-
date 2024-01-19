class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next=null;
    }
}

public class Linked_list {
    node head = null;
    public node creatnode(int a){
        node n = new node(a);
        n.data = a; // add this line
        return n;
    }
    public void display(){
        if (head == null) {
            System.out.println("empty");
        }else{
            node p = head;
            while(p!=null){
                System.out.print(p.data+" ");
                p=p.next;
            }
            System.out.println();
        }
    }
    public int count(){
        int c = 0;
        node x = head;
        while(x.next!=null){
            c++;
            x=x.next;
        }

        return c;
    }
    public void insertBeg(int a){
        node n =creatnode(a);
        if(head==null){
            head=n;
        }else {
            n.next = head;
            head = n;
        }
    }
    public void insertend(int a){

        if(head==null){
            insertBeg(a);
        }else{
            node n = creatnode(a);
            node x = head;
            while(x.next!=null){
                x=x.next;
            }
            x.next=n;

        }

    }public void insertany(int a ,int i){

        if(head==null || i == 0){
            insertBeg(a);
        } else if (i>=count()) {
            insertend(a);
        }
        else{
            node n = creatnode(a);
            node h = head;
            while(i>1){ //in linked list elements starts from 0
                i--;
                h=h.next;
            }
            n.next=h.next;
            h.next=n;
        }
    }
    public void delbeg(){
        if(head==null){
            System.out.println("empty list");
        }else{
            node p = head;
            head=p.next;
            p.next=null;p=null;
        }
    }
    public void delend(){
        if(count()==0){
            delbeg();
        }
        else{
            node p = head;
            while(p.next.next!=null){
                p=p.next;
            }
            p.next=null;
        }
    }
    public void delany(int i){
        if(i==0){
            delbeg();
        } else if (i>=count()) {
            delend();
        }else{
            node p = head;
            while(i>1){
                i--;
                p=p.next;
            }
            node q = p.next;
            p.next = p.next.next;
            q.next=null;q=null;

        }
    }
    public void reverse(){
        if(head==null || head.next==null){
            return;
        }else{
            node p = head;node q = head.next; node r = null;
            while(q!=null){
                p.next=r;//reverse linking......
                r=p;
                p=q;
                q=q.next;
            }
            p.next=r;
            head=p;
        }
    }
    public static void main(String[] args) {
        Linked_list l1 = new Linked_list();
        l1.insertend(10);
        l1.insertend(11);l1.insertend(22);l1.insertend(33);
        l1.insertBeg(2);
        l1.insertany(15,3);
        l1.display();
        l1.delbeg();
        l1.delend();
        l1.delany(2);
        l1.display();
        l1.reverse();
        l1.display();


    }
}
