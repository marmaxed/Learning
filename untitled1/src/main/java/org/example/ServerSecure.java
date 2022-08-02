package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServerSecure {
    class Vertex {
        int value;
        public boolean isVisit = false;
        public Vertex(int value){
            this.value = value;
        }
    }
    int getAdjVertex(int v, Vertex[] vertex, int[][] matrix){
        for(int j =0; j<vertex.length;j++){
            if(matrix[v][j]=='1'&&vertex[v].isVisit==false){
                return v;
            }
        }
        return -1;
    }
    public void resViaGraphs(){
        Scanner scan = new Scanner(System.in);
        int peeks = scan.nextInt();
        int step = scan.nextInt();
        String save = scan.next();
        int[][] matrix = new int[peeks][peeks];
        Vertex[] vertex = new Vertex[peeks];
        for(int i = 0;i<peeks;i++){
            vertex[i]= new Vertex(i);
            for(int j=i;j<i+step;j++){
                if(save.charAt(i)=='1'&&save.charAt(j)=='1'){
                    matrix[i][j]=1;
                    matrix[j][i]=1;
                }
            }
        }
        boolean itsReal = false;
        LinkedList<Vertex> Stack = new LinkedList<>();
        Stack.push(vertex[0]);
        while(!Stack.isEmpty()){
            int v = getAdjVertex(Stack.peek().value,vertex,matrix);
            if(v==-1){
                Stack.pop();
            }
            else{
                if(v==peeks-1){
                    itsReal=true;
                }
                vertex[v].isVisit=true;
                Stack.push(vertex[v]);
            }
        }
        if(itsReal){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public void simpleRes(){
        Scanner scanner = new Scanner(System.in);
        int Amount = scanner.nextInt();
        int step = scanner.nextInt();
        String ways = scanner.next();
        int count = 0;
        boolean impossible = false;
        for(int i =1; i<ways.length();i++){
            if(ways.charAt(i)==ways.charAt(i-1)&&ways.charAt(i)==0){
                count++;
                if(count>step){
                    impossible=true;
                }
            }
        }
        if(impossible){
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
