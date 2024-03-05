class count_digit{
    public static int count(int n){
        int x=n;
        int c= 0;
        while(x>0){
        x= x/10;
      c++;
      
        }
        return c;
    }
    
    public static int count_2(int n){
       String st =  Integer.toString(n);
      
        
        return st.length();
    }
    
    public static void main(String[] args) {
        int  n = 104;
        System.out.println(count(n));
        System.out.println(count_2(n));
    
    }}