
    
  int maxNumber = Integer.MIN_VALUE;
  int can = 0;

  for(int i: candles){
      if(i > maxNumber){
          maxNumber = i;
      }
  }

  for(int j : candles){
      if(j == maxNumber){
          can++;
      }
  }

  return can;
}
