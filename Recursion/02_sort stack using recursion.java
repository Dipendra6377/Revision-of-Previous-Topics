class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.isEmpty()) return s;
		int temp = s.peek();
		s.pop();
		sort(s);
		System.out.println(temp);
		return sortItbro(s,temp);
	}
	public Stack<Integer> sortItbro(Stack<Integer> s,int x){
	    if(s.isEmpty() || s.peek()<x ){
	        s.push(x);
	        return s;
	    }
	    else{
	        int temp=s.peek();
	        s.pop();
	        sortItbro(s,x);
	        s.push(temp);
	    }
	    return s;
	}
}
