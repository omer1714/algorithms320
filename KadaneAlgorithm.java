/**
 * Created by Omer on 12/1/2016.
 */

import java.util.*;
import java.io.*;

public class KadaneAlgorithm {
    int max_so_far=0;
    int max_ending_here=0;
    int []a;
    public KadaneAlgorithm(int [] a) {
        this.a=a;
    }

    public int solution(){

        int s=0;int e=0;boolean f=false;
        for (int i = 0; i <a.length; i++) {

            if (max_ending_here+a[i]>0) {

                max_ending_here=max_ending_here+a[i];

                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                    if (!f) {
                        s=i;
                        f=true;
                    }
                    e=i;
                }
            }

        }
        System.out.println("Position in array :(" + s +","+e+")");
        return max_so_far;

    }

    public static void main(String[] args) {
        int a[]={-2,-3,4,1,-2,1,5,-3}; // change it with your input array

        //int a[] = {-6,2,-3,-4,-1,-5,-5};
        //int a[]={-1,2,3,-3,4};

KadaneAlgorithm sdf = new KadaneAlgorithm(a);
        System.out.println(sdf.solution());}}



/*ArrayList<String> myarray = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\xampp\\htdocs\\cosc320\\src\\dataMillion.txt")))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                myarray.add(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/


/*Arrays.toString(arr);

        System.out.println("Hello!");
        Arrays.toString(a);


        System.out.println("\n");
        System.out.println(myarray);
        System.out.println("\n");
        System.out.println(a);

        KadaneAlgorithm sdf = new KadaneAlgorithm(a);
        System.out.println(sdf.solution());

KadaneAlgorithm sdf2 = new KadaneAlgorithm(arr);
        System.out.println(sdf2.solution());


    }


}*/
