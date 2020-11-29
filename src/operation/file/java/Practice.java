package operation.file.java;

import java.io.*;


public class Practice {


	public static void main(String[] args) {
		
		System.out.println("welcome to Lockedme.com ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File file1 = new File("F:\\FSD recording\\Lockedme\\dd.txt");
		
		File file2 = new File("F:\\FSD recording\\Lockedme\\aa.txt");
		
		File file3 = new File("F:\\FSD recording\\Lockedme\\cc.txt");
		
		String dirname= "F:\\FSD recording\\Lockedme";
		
		File file4 = new File(dirname);
		
		String data= "now this is first file writting with my code 1";
		String data1= "now this is second file writting with my code 2";
		String data2= "now this is third file writting with my code 3";
		
		char[] array1 = new char[100];
		char[] array2 = new char[100];
		char[] array3 = new char[100];
		
		
		
		try {
			
			
			
			  FileWriter output = new FileWriter("F:\\FSD recording\\Lockedme\\dd.txt");
		      FileWriter output1 = new FileWriter("F:\\FSD recording\\Lockedme\\aa.txt");
		      FileWriter output2 = new FileWriter("F:\\FSD recording\\Lockedme\\cc.txt");
			
			
			FileReader input = new FileReader("F:\\FSD recording\\Lockedme\\dd.txt");
			FileReader input1 = new FileReader("F:\\FSD recording\\Lockedme\\aa.txt");
			FileReader input2 = new FileReader("F:\\FSD recording\\Lockedme\\cc.txt");
			LinearSearch obj= new LinearSearch();
			
			//file creation 
	
			if(file1.createNewFile()||file2.createNewFile()||file3.createNewFile()) {
			
				System.out.println("all file created");
				
				}
			else {
				System.out.println("File already exist");
			}
	
				if(file4.exists()){
							
					for(int j=1;j<5;j++) {
				
					switch(j){
						
						//write files in directory
					case 1:
						
						// Writes string to the file
						output.write(data);
						output1.write(data1);
						output2.write(data2);
					      System.out.println("Data is written to the file.");

					      // Closes the writer
					      output.close();
					      output1.close();
					      output2.close();
					break;
					//read files in directory
					case 2:
						
						// Reads characters
					  
						input.read(array1);
						input1.read(array2);
						input2.read(array3);
					      
						System.out.println("Data in the file:");
					    
						 System.out.println(array1);
					     System.out.println(array2);
					     System.out.println(array3);

					     // Closes the reader
					      input.close();
					      input1.close();
					      input2.close();
					break;
					// search and sorting all file created in directory
					case 3:
						
					   
						System.out.println("If file already exist then show file");
						String array[]=file4.list();
						for (int i=0; i<array.length;i++)
						System.out.println(array[i]);
						System.out.println("Enter word to be searched.");
				        String search = br.readLine();
				       
				         obj.linSearch(array,search);
						
						
						break;	
					case 4:
						
						/*System.out.println("File1 deleted"+file1.delete());
						System.out.println("File2 deleted"+file2.delete());
						System.out.println("File3 deleted"+file3.delete());
						System.out.println("file deleted.");*/
					break;
					
				default:
					
					System.out.println("it is default statement");
					
					break;	
					
				}
				}
				}
				
				
				else {
					
					System.out.println("File1 not exist");
				}
				
				}
	
		catch(IOException e){
			
			System.out.println("FIle not created+ " +e);
			
		}
		
		finally {
			
			System.out.println("File operation completed");
			
			
		}
		
		
		}

		}


