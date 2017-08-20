import java.util.*;

/**
 * Created by lyf on 2017/8/20.
 */
public class ConvertToFibonacci {
    public static void main(String args[]){
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int cnt = 0;
        while(true){
            int num = fibonacci.get(cnt) + fibonacci.get(cnt + 1);
            fibonacci.add(num);
            if(num >= target){
                break;
            }
            cnt++;
        }
        if(fibonacci.get(fibonacci.size() -1) == target){
            System.out.print(0);
        }else{
            System.out.print(Math.min((fibonacci.get(fibonacci.size()-1) - target),(target - fibonacci.get(fibonacci.size()-2))));
        }
    }
}
