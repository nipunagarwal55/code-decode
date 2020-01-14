class anonymousarray {
  static void sum(int a[][])     
   { 
	int i,j;
	     for(i=0;i<a.length;i++)
	         { 
		for(j=0;j<a[i].length;j++)
	              { 
		System.out.print(a[i][j]+"\t");
              		}
	            System.out.println();
         	          }
   }
   public static void main(String args[])
    { 
        sum(new int[][]{{10,20},{30,40},{50,60}});      //ARRAY WITHOUT NY NAME
    }
} 