    char[] arr = str.toCharArray();
      Stack<Character> stack = new Stack<Character>();
      
        for(char c: arr) {
            if(c!='#')
                stack.push(c);
            else if(!stack.isEmpty()) {
                stack.pop();
            }
        }
      return String.valueOf(stack);  // How to convert stack to string.
