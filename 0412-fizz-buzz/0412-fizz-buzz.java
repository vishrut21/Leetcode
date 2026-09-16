class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>(n);
        for(int i = 1; i<= n; i++){
            boolean div3  = i%3 == 0;
            boolean div5 = i%5 == 0;

            if(!div3 && !div5){
                arr.add(Integer.toString(i));
            }else if(div3 && div5){
                arr.add("FizzBuzz");
            }else if(div3){
                arr.add("Fizz");
            }else{
                arr.add("Buzz");
            }
        }
        return arr;
    }
}