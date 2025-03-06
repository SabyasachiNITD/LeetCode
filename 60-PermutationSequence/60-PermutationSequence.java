class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new LinkedList<>();
        int fact = 1;
        for(int i=1;i<=n;i++){
            list.add(i);
            fact *= i;
        }
        int noOfPermutations = fact/n;
        k--;
        while(true){
            int idx = k/noOfPermutations;
            int charToChoose = list.get(idx);
            System.out.println(k+" "+noOfPermutations+" "+charToChoose+" "+list.size());
            sb.append(charToChoose);
            list.remove(idx);
            if(list.size()==0) break;
            k %= noOfPermutations;
            noOfPermutations/= list.size();
        }
        return sb.toString();
    }
}