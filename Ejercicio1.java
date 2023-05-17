public int[] invertirArray(int[] A){
    int com=0,ult=0;
   for(int i=0;i<A.length();i++){
      com=A[i];
      A[i]=A[A.length()-ult];
      A[A.length()-ult]=com;
      ult++;

   }
 

 return A[];
}

