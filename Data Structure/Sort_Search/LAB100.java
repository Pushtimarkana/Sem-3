public class LAB100 {
    public static void main(String[] args) {
        int a[] = {2,0,1};

        int count = 0;
        for (int i = 0; i < a.length-1; i++) 
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if (a[j]>a[j+1]) 
                {
                    int swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;

                    count = 1;
                }
                if (count == 0) 
                {
                    break;
                }
            }   
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}