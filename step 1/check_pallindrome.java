public class check_pallindrome {


    public static void main(String[] args) {
        
    
    int n1 = 121;
    int n=n1;
    
    int res =0;
    while(n!=0){
    int rem = n%10;
    res= res*10+rem;
    n/=10;
    }

    if(n1==res){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }




}
}
