import java.util.ArrayList;

public class MazePathProblem {
    //Using Tree Recursion
    public static void pathFinder(int down, int right, ArrayList<String> paths,int flag,String str) {
        //Termination case
        if(down>2 || right>2){
            return;
        }

        //Business logic
        if(down!=0 && flag==0){
            str = str+"D";
        }
        else if(right!=0 && flag==1){
            str = str+"R";
        }

        if(down==2 && right == 2){
            paths.add(str);
        }

        //Multiple Recursive call
        pathFinder(down+1, right ,paths,0,str);
        pathFinder(down, right+1, paths,1,str);
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        pathFinder(0, 0, list, 0, "");
        System.out.println("\nAll the possible paths to reach the goal are given below....\n");
        System.out.println(list);
        System.out.println();
    }
}
