class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operators = new HashSet<>(Arrays.asList("+" , "-", "*" , "/"));

    for(String token : tokens){
        if(operators.contains(token)){
            int b = stack.pop();
            int a = stack.pop();

            int result;
            switch(token){
                case "+":
                    result = a + b ;
                    break;
                case "-":
                    result = a - b ;
                    break;
                case "*":
                    result = a * b ;
                    break;
                case "/":
                    result = a / b ;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + token);
            }
            stack.push(result);
        }
        else{
            stack.push(Integer.parseInt(token));
        }
    }
    return stack.peek();
    }
}