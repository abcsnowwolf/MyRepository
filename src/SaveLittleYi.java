import java.util.Scanner;

/**
 * Created by lyf on 2017/8/19.
 */
public class SaveLittleYi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int[][] pos = new int[n][2];
        int nearPos = 0;
        for(int i = 0;i<n;i++){
            pos[i][0] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            pos[i][1] = input.nextInt();
        }
        for(int i =0;i<n;i++){
            if(nearPos == 0){
                nearPos = pos[i][0] + pos[i][1] - 2;
            }
            else{
                if(nearPos < (pos[i][0] + pos[i][1] - 2)){
                    nearPos = (pos[i][0] + pos[i][1] - 2);
                }
            }
        }
        System.out.print(nearPos);
    }

}
