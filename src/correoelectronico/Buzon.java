package correoelectronico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Buzon {

    Correo c;
    
    public int numeroDeCorreos(ArrayList <Correo> arrayCorreo)
    {
        return arrayCorreo.size();
    }
    
    public void tamanoDoBuzon(ArrayList <Correo> arrayCorreo)
    {
        JOptionPane.showMessageDialog(null,"Vostede ten: " +numeroDeCorreos(arrayCorreo)+ " correos na sua bandeixa de entrada", "Correo", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Vostede ten: " +numeroDeCorreos(arrayCorreo)+ " correos na sua bandeixa de entrada");
        System.out.println(".......................");
    }

    public void engade(Correo c, ArrayList <Correo> arrayCorreo) 
    {
        boolean engadir=true;
        int bo;
        
        while (engadir==true)
        {
            c.setContido(JOptionPane.showInputDialog("Contido Do Correo"));
            c.setLido(false);
            arrayCorreo.add(new Correo(c.getContido(), c.getLido()));
            bo=Integer.parseInt(JOptionPane.showInputDialog("Desexa Engadir Outro Correo Mais?\n"
                    + "1- SI\n"
                    + "2- NO"));
            
            if (bo==1) engadir=true;
            else engadir=false;                
        }
    }

    public void verBuzon(ArrayList <Correo> arrayCorreo)
    {
        String mensaxe;
        for (int i=0; i<arrayCorreo.size(); i++)
        {
            if (arrayCorreo.get(i).getLido()==false)mensaxe="Correo NON Lido";
            else mensaxe="Correo Lido";
            System.out.println(".......................");
            JOptionPane.showMessageDialog(null,arrayCorreo.get(i).getContido()+"\n\n",mensaxe, JOptionPane.INFORMATION_MESSAGE);
            System.out.println(mensaxe+":\n "+arrayCorreo.get(i).getContido());
            System.out.println(".......................");
        }
    }
    
    public boolean porLer(ArrayList <Correo> arrayCorreo) 
    {
        boolean porLer=false;
        
        for (int i=0; i<arrayCorreo.size(); i++)
        {
            if (arrayCorreo.get(i).getLido()==false) porLer=true;
        }
        return porLer;
    }
    
    public void pLer(ArrayList <Correo> arrayCorreo)
    {
        if (porLer(arrayCorreo) == true) 
        {
            JOptionPane.showMessageDialog(null, "Vostede ten correos por ler", "Mensaxe Informacion", JOptionPane.INFORMATION_MESSAGE );
            System.out.println("Vostede ten correos por ler");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Vostede NON ten correos por ler", "Mensaxe Informacion", JOptionPane.INFORMATION_MESSAGE );
            System.out.println("Vostede NON ten correos por ler");
        }
    }

    public String amosaPrimeiroNonLido(ArrayList <Correo> arrayCorreo) 
    {
        String contido="";
        for (int i=0; i<arrayCorreo.size(); i++)
        {
            if (arrayCorreo.get(i).getLido()==false) 
            {
                contido = arrayCorreo.get(i).getContido();
                arrayCorreo.get(i).setLido(true);
                i = arrayCorreo.size();
            }
        }
        return contido;
    }
    
    public void primeiroCorreoNonLido(ArrayList <Correo> arrayCorreo)
    {
        System.out.println("...........................");
        String contido = amosaPrimeiroNonLido(arrayCorreo);
        JOptionPane.showMessageDialog(null,contido, "CONTIDO DO PRIMER CORREO NON LIDO", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("CONTIDO DO PRIMEIRO CORREO NON LIDO: \n"+ contido);
        System.out.println("...........................");
    }

    public String amosa(ArrayList <Correo> arrayCorreo, int k) 
    {
        String contido="";
        for (int i=0; i<arrayCorreo.size(); i++)
        {
            if (i == k)
            {
                contido = arrayCorreo.get(i).getContido();
                arrayCorreo.get(i).setLido(true);
                i = arrayCorreo.size();
            }
        }
        return contido;
    }
    
    public void mostrarAmosa(ArrayList <Correo> arrayCorreo)
    {
        int k;
        k = Integer.parseInt(JOptionPane.showInputDialog("Que Correo Desexa Ler? Teclea Posicion"));
        k = k-1;
        
        String contido = amosa(arrayCorreo, k);
        
        System.out.println(".....................");
        JOptionPane.showMessageDialog(null, contido, "CONTIDO DA MENSAXE "+(k), JOptionPane.INFORMATION_MESSAGE);
        System.out.println("CONTIDO DA MENSAXE "+k+"\n\n"+contido);
        System.out.println(".....................");
        
    }
        
    

    public void elimina(ArrayList <Correo> arrayCorreo) 
    {
        int k;
        k= Integer.parseInt(JOptionPane.showInputDialog("Que Mensaxe Desexa Borrar"));
        k=k-1;
        boolean borrado=false;
        for (int i=0; i<arrayCorreo.size();i++)
        {
            if (i == k)
            {
                arrayCorreo.remove(i);
                borrado=true;
                i=arrayCorreo.size();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sintoo Moito NON Se Atopou Esa Mensaxe", "OH OH HOUBO UN ERRO", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("OH OH HOUBO UN ERRO \n\n  Sintoo Moito NON Se Atopou Esa Mensaxe");
            }
        }
        
        if (borrado==true)
        {
            System.out.println("..................................");
            JOptionPane.showMessageDialog(null, "A Mensaxe Foi Borrada Con Exito", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("INFORMACION \n\n  A Mensaxe Foi Borrada Con Exito");
            System.out.println("..................................");
        }
        else
        {
            System.out.println("..................................");
            JOptionPane.showMessageDialog(null, "A Mensaxe Non Foi Borrada", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("INFORMACION \n\n  A Mensaxe NON Foi Borrada");
            System.out.println("..................................");
        }             
    }
}

