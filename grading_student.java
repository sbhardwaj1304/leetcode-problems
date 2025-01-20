 
    
 List<Integer> finalRoundedGrades = new ArrayList<>();
        
 for(int g : grades){
     if(g < 38){
         finalRoundedGrades.add(g);
     }else{
         finalRoundedGrades.add(  ( ( 5 - (g % 5) ) < 3) ? g + ( 5 - (g % 5) ) : g  );
     }
     
 }

 return finalRoundedGrades;
}
}

