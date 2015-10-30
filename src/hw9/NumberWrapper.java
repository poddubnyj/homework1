package hw9;

/**
 * Created by Poddubniy on 30.10.2015.
 */
public class NumberWrapper {

    public Integer[] getArr() {
        return arr;
    }

    private Integer[] arr;
    

    public NumberWrapper(int initalLenght) {
        if(initalLenght <= 0) {
            throw new IllegalArgumentException("Lenght cannot be less than 0 or 0");
        }
        this.arr = new Integer[initalLenght];

        for (int i =0; i<arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
    }

    public void add(Integer i) {
        Integer tmparr[] = new Integer[arr.length +1];
        System.arraycopy(arr,0,tmparr,0,arr.length);
        tmparr[tmparr.length-1]=i;
        arr=tmparr;
    }

    public void remove(Integer i) {
        Integer tmparr[] = new Integer[arr.length -1];
        System.arraycopy(arr,0,tmparr,0,i);
        System.arraycopy(arr,i+1,tmparr,i, tmparr.length-i);
        arr=tmparr;

    }

    public void setValue(Integer[] i) {




    }
/*    public Integer get(int pos) {
        ...
    }
    ....*/
}


