package com.GL.MNC.Services;

public class ConvertTransactionDataStructure {
	
		public static Node node;
	    static Node prevNode = null;
	    static Node headNode = null;
	    
		public static Node bstToSkewedTree(Node root){
			try {
	        if(root == null)
	        {
	            return headNode;
	        }
	       
	       
	        Node rightNode = root.right;
	        Node leftNode = root.left;
	        
	        bstToSkewedTree(leftNode);
	        if(headNode == null)
	        {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	     // subtree on the basis of the order required
	        
	        	 bstToSkewedTree(rightNode);
	            }catch(Exception e) {
	            	e.printStackTrace();
	            }
			return headNode;
		}
		
		
	    public static void traverseRightSkewed(Node root){
	    	 if(root == null)
	         {
	             return;
	         }
	         System.out.print(root.data+" ");
	         traverseRightSkewed(root.right); 
	    	
	    }

	}


