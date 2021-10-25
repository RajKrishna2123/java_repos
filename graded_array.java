public class graded_array {
    
    public static void main(String[] args)   
    {  
        int r1=0,r2=0,r3=0,r4=0,r5=0,i;    
        int[] array = new int[20];
        System.out.println("Entering the elements in the array: ");
        for(i=0;i<20;i++)
        {
            array[i]=0 + (int)(Math.random() * 100);
        }
         for(i=0;i<20;i++)
        {
            if(array[i]>=0&&array[i]<=25)
            {   
                r1=r1+1;
            }
            else if(array[i]>=26&&array[i]<=50)
            {   
                r2=r2+1;
            }
            else if(array[i]>=51&&array[i]<=75)
            {   
                r3=r3+1;
            }
            else if(array[i]>=76&&array[i]<=95)
            {   
                r4=r4+1;
            }
            else if(array[i]>96&&array[i]<100)
            {   
                r5=r5+1;
            }
        }
        System.out.println("no of sstudent in range 0-25 "+r1);
        System.out.println("no of sstudent in range 26-50 "+r2);
        System.out.println("no of sstudent in range 51-75 "+r3);
        System.out.println("no of sstudent in range 76-95 "+r4);
        System.out.println("no of sstudent in range 96-100 "+r5);

    }
}
