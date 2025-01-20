 
    

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
       int res=0;
    List<Integer> newList=new ArrayList<>(ar);
    for (int i = 0; i < newList.size(); i++) {
        res += newList.get(i);
    }
    return res;
    
        }
    
    }
