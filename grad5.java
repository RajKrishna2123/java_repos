public class grad5
{

    public static int min(int counter[],int nFrames)
{
    int minimum = counter[0];
    int pos = 0;
    for(int i=0;i<nFrames;i++) { if(minimum > counter[i])
          pos = i;
    }
 return pos;
}

    public static void main(String[] args) 
    {
        int recent = 0,pageFault = 0,nFrames;


        int pageString[] = new int[10];

        for(int i=0;i<10;i++) 
        {

            int temp = (int)(Math.random()*10);
		    pageString[i]=temp;

        }
        System.out.print("Refrence String:-"+"  ");
        for ( int i =0 ; i < 10 ; i++)
        {
    	    System.out.print(" "+pageString[i]);

        }
        System.out.println();
        nFrames = 3;
        int frames[] = new int[nFrames];
        int counter[] = new int[nFrames];

        for(int i=0;i<nFrames;i++)
        {
            frames[i] = 0;
            counter[i] = 0;
        }

        for(int i=0;i<10;i++)
        {
            int flag =0;
            for(int j=0;j<nFrames;j++)
            {
                if(frames[j] == pageString[i])
                {
                    flag=1;
                counter[j] = recent++;
                break;
                }
            }

        if(flag == 0)
        {
            for(int j=0;j<nFrames;j++)
            {
                if(frames[j] == 0)
                {   
                    frames[j] = pageString[i];
                    counter[j] = recent++;
                    flag=1;
                    pageFault++;
                    break;
                }

            }
        }

        if(flag == 0)
        {
            int PositionToreplace = min(counter,nFrames);
            frames[PositionToreplace] = pageString[i];
            counter[PositionToreplace] = recent++;
            pageFault++;
        }

        System.out.println();
        for(int j=0;j<nFrames;j++)
        {
           System.out.print(frames[j]+" ");
        }

    }

      System.out.print("\nPage Fault: "+pageFault);

      System.out.println("\ndeepak");

    }

}
