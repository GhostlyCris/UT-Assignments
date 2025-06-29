/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 11

# Problem: 2

# Date: 11/19/21 

# Summary: write and read from file like we are in 1st grade, but doing it with java now

#  		Problem 2 (5 Points)
	Write a Java program that reads from a text file and prints out the output.
	The text file should be named your last name.txt for example doe.txt.
	The text file should contain the following information:
	Course, Number, Instructor, Credit hours.
	
	So you could have something like: 
	CSET, 1200, Oluoch, 3
	ENGT, 2000, Alaraje, 1
	
	Make sure you have at least 5 rows and you must have commas seperating 
	each column.

	Read from the text file and print out all contents.
	https://youtu.be/XlUGyEj-iVM
*/


import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;
import java.util.*; //We really don't care anymore look for all neccessary packages and WORK!!

public class FileIO{	
	public static void main(String[] args) throws java.io.IOException {
		//call my file "file" for short while making an instance
		java.io.File file = new java.io.File("Zaragoza.txt");
		
		//check if it exists first to cut the work
		if(file.exists()==true)
		{ 	
			System.out.println("File " + file + " already exists.");
			
			//Scan file while it has lines to read and output
			Scanner read = new Scanner(file);
			  while (read.hasNextLine()) 
				{
				String data = read.nextLine();
				System.out.println(data);
				}
				System.exit(0);
		}
		else
		{
		//try making the file just in case
		try(
		//create a file
		java.io.PrintWriter output = new java.io.PrintWriter(file);
			)	
			{
			//write formated output to the file
			output.println("CSET, 1200, Oluoch, 3 ");
			output.println("CSET, 2230, Langenderfer, 4 ");
			output.println("MATH, 2450, Robinson, 4 ");
			output.println("CSET, 2200, Brahaney, 4 ");
			output.println("CSET, 2200, Brahaney, 0 ");
			
			//Close the file
			output.close();
			}
			//read the file now 
			System.out.println("File " + file + " was made.");
			Scanner read = new Scanner(file);
			  while (read.hasNextLine()) 
				{
				String data = read.nextLine();
				System.out.println(data);
				}
		}
		
	}
}