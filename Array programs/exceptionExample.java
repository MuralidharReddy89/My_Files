

class exceptionExample{
    public static void main(String args[]){
        try{
        int a=100,b=0;
        int c=a/b;
        System.out.print(c);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}