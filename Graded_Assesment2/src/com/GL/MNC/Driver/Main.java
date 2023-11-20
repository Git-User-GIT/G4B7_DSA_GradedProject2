package com.GL.MNC.Driver;

import com.GL.MNC.Services.ConvertTransactionDataStructure;
import com.GL.MNC.Services.Node;

public class Main {
	

		 public static Node node;
		 static Node headNode = null;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ConvertTransactionDataStructure convert =new ConvertTransactionDataStructure();
	      
			Main tree = new Main();
			tree.node=new Node(50);
			tree.node.left=new Node(30);
			tree.node.right=new Node(60);
			tree.node.left.left=new Node(10);
			tree.node.right.left=new Node(55);
					
			
			
			headNode=convert.bstToSkewedTree(node);
			convert.traverseRightSkewed(headNode);
		}

	}


