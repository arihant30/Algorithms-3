//test22
class Solution
{
	ArrayList<Integer> outputarr;
	ArrayList <Integer> printBoundary(Node node)
	{
	    outputarr=new ArrayList<>();
	    if(node==null){
	        return outputarr;
	    }
	    if(node.left==null && node.right==null){
	        outputarr.add(node.data);
	        return outputarr;
	    }
	    outputarr.add(node.data);
	    printleft(node.left);
	    printleaves(node.left);
	    printleaves(node.right);
	    printright(node.right);
	    return outputarr;
	}
	void printleft(Node node){
	    if(node==null)
	        return;
        if(node.left!=null){
            outputarr.add(node.data);
            printleft(node.left);
        }
        else if(node.right!=null){
            outputarr.add(node.data);
            printleft(node.right);
        }
	}
	void printleaves(Node node){
	    if(node==null)
	        return;
	   printleaves(node.left);
	   if(node.left==null && node.right==null)
	        outputarr.add(node.data);
	   printleaves(node.right);
	}
	void printright(Node node){
	    if(node==null)
	        return;
	   if(node.right!=null){
	       printright(node.right);
	       outputarr.add(node.data);
	   }
	   else if(node.left!=null){
	       printright(node.left);
	       outputarr.add(node.data);
	   }
	}
}
