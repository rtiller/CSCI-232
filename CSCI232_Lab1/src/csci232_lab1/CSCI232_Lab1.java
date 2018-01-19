/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci232_lab1;

/**
 *
 * @author d62r481
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CSCI232_Lab1 
{
    public static void main(String[] args) throws IOException 
    {
        
        Path fileRead = Paths.get("src/input.txt");
        Path fileWriteA = Paths.get("src/output/outputA.txt");
        Path fileWriteB = Paths.get("src/output/outputB.txt");
        String s;
        
    /* Part 1
    ---------------------------------------------------------------
    ---------------------------------------------------------------
    */  /*   
        Charset charset = Charset.forName("US-ASCII");
        
        try(BufferedReader reader = Files.newBufferedReader(fileRead, charset)) 
        {
            String line = null;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        }
        catch (IOException x) 
        {
            System.err.format("IOException: %s%n", x);
        }
        */



    /* Part 2
    ---------------------------------------------------------------
    ---------------------------------------------------------------
    */ /*
        Charset charset = Charset.forName("US-ASCII");
        
        try(BufferedReader reader = Files.newBufferedReader(fileRead, charset)) 
        {
            String line = null;
            while ((line = reader.readLine()) != null) 
            {
                String[] split = line.split("\\s+"); //this line splits the entire line and adds each word to an array but IDK how or why
                for (String part : split) //this for loop itterates through the string array but i dont know how or why
                {
                    System.out.println(part);
                }
            }
        }
        catch (IOException x) 
        {
            System.err.format("IOException: %s%n", x);
        }
        */
    

    /* Part 3
    ---------------------------------------------------------------
    ---------------------------------------------------------------
    */  /*
        Charset charset = Charset.forName("US-ASCII");
        BufferedReader reader = Files.newBufferedReader(fileRead, charset);
      
        //Write to File
        try(BufferedWriter writer = Files.newBufferedWriter(fileWriteA, charset)) 
        {
            while ((s = reader.readLine()) != null)
            {
                writer.write(s, 0, s.length());//print line to file
                writer.write("\n");//print new line in file
                System.out.println(s);//IDE readout
            }
            
        } 
        catch (IOException x) 
        {
            System.err.format("IOException: %s%n", x);
        }
        */           
        
    

    /* Part 4
    ---------------------------------------------------------------
    ---------------------------------------------------------------
    */  
        Charset charset = Charset.forName("US-ASCII");
        BufferedReader reader = Files.newBufferedReader(fileRead, charset);
      
        //Write to File
        try(BufferedWriter writer = Files.newBufferedWriter(fileWriteB, charset)) 
        {
            while ((s = reader.readLine()) != null)
            {
               String[] split = s.split("\\s+"); //this line splits the entire line and adds each word to an array but IDK how or why
                for (String part : split) //this for loop itterates through the string array but i dont know how or why
                {
                    writer.write(part, 0, part.length());//print line to file
                    writer.write("\n");//print new line in file
                    System.out.println(part);//IDE readout
                }
            }
            
        } 
        catch (IOException x) 
        {
            System.err.format("IOException: %s%n", x);
        }
    }
    
}
