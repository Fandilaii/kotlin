/**
 * Created by fandilai on 11/12/17.
 */

public class square {
    private int a;

    square(){
        a = 1;
    }

    public void setA(int a){
        this.a = Math.abs(a);
    }

    public int getA(){
        return this.a;
    }

}