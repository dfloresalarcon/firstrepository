
package correoelectronico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CorreoElectronico {

    public static void main(String[] args) {
        
        //OBXECTOS E ARRAY
        Buzon funciones = new Buzon();
        Correo correo = new Correo();
        ArrayList <Correo> arrayCorreo = new <Correo> ArrayList();
        int op=0;
        
        do
        {
            switch(Integer.parseInt(JOptionPane.showInputDialog("Funcións\n"
                    + "1- Crear Listaxe\n"                   
                    + "2- Ver Total Correos No Buzón\n"
                    + "3- Cantidad De Correos Por Ler\n"
                    + "4- Amosar Primeira Mensaxe NON LIDA\n"
                    + "5- Ler Unha Mensaxe Específica\n"
                    + "6- Eliminar Mensaxe\n"
                    + "7- Engadir Unha Mensaxe\n\n"
                    + "8- Saír Do Programa\n"
                    + "9- Ver Que Se Haxan Insertado Ben Os Correos (PROGRAMADOR)")))
            {
                default:
                    break;
                case 1:
                    //CREAR LISTAXE E ENGADIR MENSAXES
                    funciones.engade(correo, arrayCorreo);
                    break;
                case 2: 
                    //VER CANTIDAD DE CORREOS NO BUZON
                    funciones.tamanoDoBuzon(arrayCorreo);
                    break;
                case 3:
                    //CORREO POR LER
                    funciones.pLer(arrayCorreo);                    
                    break;
                case 4:
                    //PRIMER CORREO NON LIDO
                    funciones.primeiroCorreoNonLido(arrayCorreo);
                    break;
                case 5:
                    //AMOSAR CONTIDO DUNHA MENSAXE K
                    funciones.mostrarAmosa(arrayCorreo);
                    break;
                case 6:
                    //ELIMINAR MENSAXE
                    funciones.elimina(arrayCorreo);
                    break;
                case 7:
                    //ENGADIR MENSAXES
                    funciones.engade(correo, arrayCorreo);
                    break;
                case 8:
                    op = Integer.parseInt(JOptionPane.showInputDialog("Desexa Sair Do Programa? \n1-SI\n2- NO"));
                    if (op==1) op=10;
                    else op=2;
                    break;
                case 9:
                     //VER BUZON
                    funciones.verBuzon(arrayCorreo);    
                    break;              
            }            
        }while (op!=10);
    }
}
