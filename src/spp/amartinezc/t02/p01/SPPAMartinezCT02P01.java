/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.t02.p01;
import java.util.*;
/**
 *
 * @author andres
 */
public class SPPAMartinezCT02P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        double sue, pago;
        int cate, he;
        Scanner kb=new Scanner(System.in);
        System.out.println("Calculadora de pagos a trabajadores\n");    
        System.out.print("Ingrese el sueldo del trabajador:");
        sue=kb.nextDouble(); 
        System.out.print("Ingrese las horas extras del trabajador:");
        he=kb.nextInt();
        pago=sue+he*categorias();
        System.out.println("Pago al trabajador: $"+pago+"\n");
        regresar();
        
        
        
    }
    public static double categorias(){
        int cate;
        double  phe=0;
        
        System.out.print("Ingrese la categoría del trabajador:");
        Scanner kb=new Scanner(System.in);
        cate=kb.nextInt();
        
        if (cate==1){
            phe=30;
        }else if(cate==2){
            phe=38;
        }else if(cate==3){
            phe=50;
        }else if(cate==4){
            phe=70;
        }else if(cate==5){
            phe=102;
        }else if(cate==6){
            phe=150;
        }else if(cate==7){
            phe=218;
        }else if(cate==8){
            phe=310;
        }else{
            System.out.println("Opción no válida\n");
            categorias();
        }
        
        return phe;
    }
    
    public static void regresar(){
        int opcion;
        Scanner kb=new Scanner(System.in);
        System.out.println("[1]Volver a calcular\n[2]Salir");
        opcion=kb.nextInt();
        if(opcion==1){
            menu();
        }else if(opcion==2){
            System.out.println("Adiós");
            System.exit(0);
        }else{
            System.out.println("Opción no válida");
            regresar();
        }
        
    }
}
