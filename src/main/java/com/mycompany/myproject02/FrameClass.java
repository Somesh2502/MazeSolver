/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject02;

 


import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.orange;
import static java.awt.Color.red;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import static java.lang.constant.ConstantDescs.NULL;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Somesh singh parihar
 */

 
public class FrameClass extends JFrame{
    
   
    
   private int[][] maze = {{1,1,1,1,1,1,1,1},
            {1,0 ,0, 0, 0, 0 ,0 ,1},
            {1,0 ,1, 1, 0, 1, 1 ,1},
            {1,0 ,1,0, 1, 1, 0, 1},
            {1,0, 1, 1, 0 ,0,0,1},
            {1,0 ,0, 0, 0, 0 ,0 ,1},
            {1,0 ,0, 0, 1, 0 ,0 ,1},
            {1,0 ,1, 1, 0, 0, 1 ,1},
            {1,1 ,1,0, 1, 0, 0, 1},
            {1,0, 1, 1, 0 ,1,0,1},
            {1,0 ,0, 0, 0, 0 ,9 ,1},
               {1,1,1,1,1,1,1,1},
    };
    
    ArrayList<Pair> path = new ArrayList<>();//it will store idx of path
    
    
    
    
    
    FrameClass(){
        setSize(600,600);
        setTitle("MAZE SOLVER BY SOMESH");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
        //now i ll do dfs 
       DFS.searchPath(maze,1,1,path);
        //System.out.print(path);
        
    }
    
    
    @Override
    public void paint(Graphics g){
        g.translate(200,200);//to shift
        
        //i ll do loop around <
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[i].length;j++){
                Color mine = Color.BLACK ;
                
                switch(maze[i][j]){
                    case 1: mine = Color.black; break;
                    
                    case 9: mine = Color.ORANGE;break;
                    default : mine = Color.white;break;
                            
                            
                    
            }
                //now i ll set the colour
                g.setColor(mine);
                g.fillRect(30*j, 30*i, 30,30 );
                
                g.setColor(orange);
                g.drawRect(30*j, 30*i, 30,30);
                
                
                
                
            }
        }
        for(int i=0;i<path.size();i++){
            System.out.println(path.get(i).i+" "+path.get(i).j);
        }
        //now we are done with initial graphics and i have path array 
        //i ll take out all the elements of path array 
        for(int j=0;j<path.size();j++){
            int pathX = path.get(j).i;//pair calss
            int pathY =path.get(j).j;
            
            g.setColor(green);
            
            g.fillRect(30*pathX, 30*pathY, 15,25);
        }
      
        
        
        
        
    }
    
   
        
    
 
   
    
}

