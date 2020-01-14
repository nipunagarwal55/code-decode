class jackedarray
{ public static void main(String args[])
    { 
      int a[][]= new int[5][];
      int r,c;
      for(r=0;r<=4;r++)
        {  a[r]=new int[r+1];
        }
      for(r=0;r<=4;r++)
       { for(c=0;c<=r;c++)
          { a[r][c]=c+1;
          }
       }
      for(r=0;r<=4;r++)
       { for(c=0;c<=r;c++)
          { System.out.print(a[r][c]);
          }
         System.out.println();
       }
    }
} 