class GfG
{
    int minEle;
    Stack<Integer> s;
    GfG(){
        s=new Stack<Integer>();
    }
    /*returns min element from stack*/
    int getMin()
    {
	if(s.isEmpty()){
	    return -1;
	}
	else{
	    return minEle;
	}
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	if(s.isEmpty()){
	    return -1;
	}
	Integer t=s.pop();
	if(t<minEle){
	        int j=minEle;
	        minEle=2*minEle-t;
	        return j;
	    }
    else{
        return t;
    }
    }

    /*push element x into the stack*/
    void push(int x)
    {
	if(s.isEmpty()){
	    minEle=x;
	    s.push(x);
	    return;
	}
	if(x<minEle){
	    s.push(2*x-minEle);
	    minEle=x;
	}
	else{
	    s.push(x);
	}
    }	
}
