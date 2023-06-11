import java.util.ArrayList;

public class DiceGame {
    //Using Tree Recursion
    public static void branch(int[] diceval, int num, int sum,String str, ArrayList<String> list) {
        //Termination Case
        if(sum+num>10){
                return;
            }
            
            //Business Logic
            sum=sum+num;
            if(sum==10 && num!=0){      
                str = str+num;
                //System.out.println(str);
                if(!list.contains(str)){
                    list.add(str);
                }
                
            }
            else{
                if(num!=0){
                    str = str+num;    
                }
                            
            }

            //Multiple Recursive Calls (Tree recursion)
            branch(diceval, diceval[0], sum,str,list);
            branch(diceval, diceval[1], sum,str,list);
            branch(diceval, diceval[2], sum,str,list);
            branch(diceval, diceval[3], sum,str,list);
            branch(diceval, diceval[4], sum,str,list);
            branch(diceval, diceval[5], sum,str,list);
        }

    
    public static void main(String[] args) {
        int[] diceval = {1,2,3,4,5,6};
        
        ArrayList<String> list = new ArrayList<>();
        branch(diceval,0, 0,"", list);
        System.out.println("\nThe set of all possible combinations of dice values which makes up sum equal to 10 are: --> \n");
        System.out.println(list);
    }
}