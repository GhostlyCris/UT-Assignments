/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 9

# Problem: 1

# Date: 11/1/21 

# Summary:

#  		Problem 1
	Write a program that prompts the user to enter a positive 
	integer and displays all its smallest factors. (8 points).
	https://youtu.be/tfrsGr7TB-g

*/

import java.util.*;
import java.util.Scanner;
public class factor{
	//tree node implementation generic and simple, terms used from dictionary
	static class Node
	{
		Node left, right;
		int key;
	};   //instruction video may not been detailed enough
	static Node root;
	
	//function for a new tree node
	static Node newNode(int key)
	{
		Node temp = new Node();
		temp.key = key;
		temp.left = temp.right = null; 
		return temp;
	}
	//make tree of factors for the given "number" 
	//and store root at a reference points
	
	//insert tears
	static Node createFactorTree(Node nodeRef, int v)
	{
    (nodeRef) = newNode(v);
    // the number is factorized
    for (int i = 2 ; i < v/2 ; i++)
    {
      if (v % i != 0)
        continue;
      // factor found for left and right subtrees and return.
      // go from small to high, left children will always have smaller factor

      nodeRef.left = createFactorTree(((nodeRef).left), i);
      nodeRef.right =  createFactorTree(((nodeRef).right), v/i);
      return nodeRef;
    }
    return nodeRef;
	}
	
	static void printOrder(Node root)
	{ // Base Case
    if (root == null)  return;
	//make a queue
    Queue<Node > q = new LinkedList<>(); //learned parameter types in generic class
    q.add(root);
    while (q.isEmpty() == false)
    { // Print front of queue and remove from queue
      Node node = q.peek();
      System.out.print(node.key + " ");
      q.remove();
      if (node.left != null) //teach myself more and how to use object types
        q.add(node.left);	// simple understanding was not simple
      if (node.right != null)	// over complicate maybe everything
        q.add(node.right);
    }
	} 
	public static void main(String[] args) {
	//scanner
	Scanner input = new Scanner (System.in);
	System.out.println("Enter a positive whole number (Integer).");
	  // positive number
    int number = input.nextInt();

    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to whatever number thats positive
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
		//return i;
      }
    }
	//return number;
	
	
	//Then the factor tree that took all week to figure out the true meaning of headaches
	//ignore euclidian method for LCM 
	//ignore prime factoring and finding the inbetweeners
	//ignore many other things that made sense but didn't seem right because of scope
    root = null;
    root = createFactorTree(root, number);
	System.out.println("\nThe constructed factor tree");
    printOrder(root); 
	}
}