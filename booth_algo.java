import java.io.*;

public class booth_algo 
{
    public static void main(String args[])throws IOException
   {
     DataInputStream obj=new DataInputStream(System.in);
     int a[]={0,0,0,0};                         //common array to perform operation’s
     int tocomp[]={0,0,0,1};           // to convert a binary no to its complement
     int mulc,mulp,q_1=0;
     int m[]=new int[4];                //stores multiplicant in binary format
     int mcomp[]=new int[4];    //stores complement of  multiplicant in binary format
     int q[]=new int[4];                  //stores multiplier in binary format
     int i,carry=0;
    System.out.println(“Enter multiplicant”);
    mulc=Integer.parseInt(obj.readLine());
    System.out.println(“Enter multiplier”);
    mulp=Integer.parseInt(obj.readLine());
         for(i=3;i>=0;i–)                                                  // convert decimal to binary 
          {
            m[i]=mulc%2;
            q[i]=mulp%2;
            mulc=mulc/2;
           mulp=mulp/2;
         }
System.out.println(“Binary Of multiplicant    “);
         for(i=0;i<4;i++)
          {
            System.out.print(m[i]);
          }
System.out.println();
             System.out.println(“Binary Of multiplier“);
                   for(i=0;i<4;i++)
                    {
                     System.out.print(q[i]);
                    }      
                   for(i=0;i<4;i++)
                    {   
                       if(m[i]==0)
                          { mcomp[i]=1; }
                      else
                          { mcomp[i]=0; }  
                    }
   System.out.println();
                System.out.println(“Complement Of multiplicant    “);
                    for(i=0;i<4;i++)
                     {
                       System.out.print(mcomp[i]);
                      }

for(i=3;i>=0;i–)
  {
    if(mcomp[i]==1 && tocomp[i]==1 && carry==0)           //convert to 2’s complement by adding 1
   {
    mcomp[i]=0;
    carry=1;
   }
     else
       if(mcomp[i]==1 && tocomp[i]==1 && carry==1)
         {
          mcomp[i]=1;
          carry=1;
         }
              else
                 if(mcomp[i]==1 && tocomp[i]==0 && carry==0)
                 {
                  mcomp[i]=1;
                  carry=0;
                 }
                else
                   if(mcomp[i]==1 && tocomp[i]==0 && carry==1)
                   {
                    mcomp[i]=0;
                    carry=1;
                   }
                      else
                       if(mcomp[i]==0 && tocomp[i]==0 && carry==0)
                       {
                        mcomp[i]=0;
                        carry=0;
                       }
              else
                if(mcomp[i]==0 && tocomp[i]==0 && carry==1)
                {
                 mcomp[i]=1;
                 carry=0;
                }
                     else
                      if(mcomp[i]==0 && tocomp[i]==1 && carry==0)
                     {
                      mcomp[i]=1;
                      carry=0;
                     }
        else
          if(mcomp[i]==0 && tocomp[i]==1 && carry==1)
         {
          mcomp[i]=0;
          carry=1;
         } 
}
System.out.println();
System.out.println(“Complement Of multiplicant    “);
for(i=0;i<4;i++)
{
    System.out.print(mcomp[i]);
}
int count=4;
while(count!=0)
{
    if(q[3]==1 && q_1==0)
    {                  
        carry=0;
        for(i=3;i>=0;i–)
        {
            if(a[i]==1 && mcomp[i]==1 && carry==0)
            {
                a[i]=0;
                carry=1;
            }
            else if(a[i]==1 && mcomp[i]==1 && carry==1)
            {
                a[i]=1;
                carry=1;
            }
            else if(a[i]==1 && mcomp[i]==0 && carry==0)
            {
                a[i]=1;
                carry=0;
            }
            else if(a[i]==1 && mcomp[i]==0 && carry==1)
            {
                a[i]=0;
                carry=1;
            }
            else if(a[i]==0 && mcomp[i]==0 && carry==0)
            {
                a[i]=0;
                carry=0;
            }
            else if(a[i]==0 && mcomp[i]==0 && carry==1)
            {
                a[i]=1;
                carry=0;
            }
            else if(a[i]==0 && mcomp[i]==1 && carry==0)
            {
                a[i]=1;
                carry=0;
            }
            else if(a[i]==0 && mcomp[i]==1 && carry==1)
            {
                a[i]=0;
                carry=1;
            } 
        }    
    }

}
else if(q[3]==0 && q_1==1)
{
               carry=0;
                  for(i=3;i>=0;i–)
                     {
                       if(a[i]==1 && m[i]==1 && carry==0)
                     {
                     a[i]=0;
                    carry=1;
                     }
                    else
                     if(a[i]==1 && m[i]==1 && carry==1)
                    {
                      a[i]=1;
                      carry=1;
                    }
                   else
                     if(a[i]==1 && m[i]==0 && carry==0)
                   {
                    a[i]=1;
                    carry=0;
                   }
                    else
                     if(a[i]==1 && m[i]==0 && carry==1)
                    {
                     a[i]=0;
                     carry=1;
                    }
                      else
                       if(a[i]==0 && m[i]==0 && carry==0)
                       {
                        a[i]=0;
                        carry=0;
                       }
              else
                if(a[i]==0 && m[i]==0 && carry==1)
                {
                 a[i]=1;
                 carry=0;
                }
                     else
                      if(a[i]==0 && m[i]==1 && carry==0)
                     {
                      a[i]=1;
                      carry=0;
                     }
        else
          if(a[i]==0 && m[i]==1 && carry==1)
         {
          a[i]=0;
          carry=1;
         } 
         }
   }
if(q[3]==1 && q_1==0 || q[3]==0 && q_1==1)
{
 System.out.println();
for(i=0;i<4;i++)
                     {
                       System.out.print(a[i]);
                      }
System.out.print(“\t\t”);
             //System.out.println(“Binary Of multiplier    “);
                   for(i=0;i<4;i++)
                    {
                     System.out.print(q[i]);
                    }
           System.out.print(“\t\t”+count);
}
q_1=q[3];                                   //manual right shifting
q[3]=q[2];
q[2]=q[1];
q[1]=q[0];
q[0]=a[3];
a[3]=a[2]; 
a[2]=a[1];
a[1]=a[0];  
count–; 
                  System.out.println();
for(i=0;i<4;i++)
                     {
                       System.out.print(a[i]);
                      }
System.out.print(“\t\t”);
             //System.out.println(“Binary Of multiplier    “);
                   for(i=0;i<4;i++)
                    {
                     System.out.print(q[i]);
                    }
           System.out.print(“\t\t”+count);

}System.out.println();for(i=0;i<4;i++)

    {
        System.out.print(a[i]);
    }System.out.print(“\t\t”);
    // System.out.println(“Binary Of multiplier “);
    for(i=0;i<4;i++)
    {
        System.out.print(q[i]);
    }System.out.println();System.out.println(“Complement Of multiplicant“);for(i=0;i<4;i++)
    {
        System.out.print(mcomp[i]);
    }

}}
