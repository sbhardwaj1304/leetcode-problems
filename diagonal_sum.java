    
  int n = arr.size();
        
  int total = 0;
  for (int i = 0; i < n; i++) {
      // int left = arr.get(i).get(i);
      // int right = arr.get(i).get(n - 1 - i);
      // total += (left - right);
      total += arr.get(i).get(i) - arr.get(i).get(n - 1 - i);
  }
  
  return Math.abs(total);
}
