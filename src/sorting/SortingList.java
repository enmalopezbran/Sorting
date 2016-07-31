package sorting;

import java.io.IOException;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Jorge Mario Tezen Cristales 15417
 */
public class SortingList {

  
    public static void main(String[] args) throws IOException {
        
        //se instancia una lista de tipo Integer
        Lista<Integer> miLista=new Lista<Integer>();
        String elemento=" ";
        int num;
        String archivo="C:\\Users\\Usuario\\Documents\\NetBeansProjects\\SortingList\\src\\sortinglist\\prueba.txt";
        
        Vector parrafo = Lector.leerArchivo(archivo);
        
        //se accede al elemento del vector 
        for (int i = 0; i<parrafo.size();i++){
            elemento = (String) parrafo.elementAt(i);
            //se castea a int y se agrega a la lista
            num=Integer.parseInt(elemento);
            miLista.addNodo(num);
        }
        
        //se utiliza seleccion sort
        miLista.selectionSort();
        miLista.Print();
        
        
        
       
        
        
        
        
    }
    
}
