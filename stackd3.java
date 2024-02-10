public class stackd3 {

    static int stacko[] = new int[5];
    static int top=-1;
    //static variable is available throughtout the code
    public static void push(int item){
        if(top== stacko.length) {
            System.out.println("stack overflow");
        }else{
              stacko[++top]=item;
        }
    }

    public static void pop(){
        if(top==1){
            System.out.println("stack undeflow,stack undeflow");
            }
            else{
                int item=stacko[top];
            top--;
        }
    }

    public static void main(String[] args) {
        push(60);
        push(90);
        push(79);

        for (int i=0;i<=top;i++)
            System.out.println(stacko[i]+" ------> " + stacko[++i]);



    }
}
