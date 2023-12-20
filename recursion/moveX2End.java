// time complexity -> O[n]
public class moveX2End {

    private static void moveAllX(String str, int index, int count,String newStr){
        if (index == str.length()){
            System.out.print(newStr);
            for (int i=0;i<count;i++){
                System.out.print("x");
            }
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == 'x') {
            moveAllX(str,index+1,count+1,newStr);
        }else {
            newStr += currChar;
            moveAllX(str,index+1,count,newStr);
        }
    }

    public static void main(String[] args) {

        String str = "axbxcxdxxefjhszajxsj";
        moveAllX(str,0,0,"");

    }
}
