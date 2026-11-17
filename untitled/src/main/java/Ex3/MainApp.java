package Ex3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MainApp {
    public static void scriere(List<Mobilier> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/mobilier.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Mobilier> citire() {
        try {
            File file=new File("src/main/resources/mobilier.json");
            ObjectMapper mapper=new ObjectMapper();
            List<Mobilier> persoane = mapper.readValue(file, new TypeReference<List<Mobilier>>(){});
            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        List<Mobilier> mobila=citire();
        for(var var:mobila)
            System.out.println(mobila);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti mobilierul care va fi afisat");
        String nume=scanner.nextLine().trim();
        for(var var:mobila)
            if(var.getNume().equalsIgnoreCase(nume))
                System.out.println(var.getPlaci());
        long arieMax=(long)2800*2070;
        for(var var:mobila)
        {
            long ariePlaci=0;
            for(var var2:var.getPlaci())
            {
                ariePlaci+=(long) var2.getLatime()*var2.getLungime();
            }
            int nrPlaci=(int) Math.ceil((float)arieMax/ariePlaci);
            System.out.println("Numarul de placi pt "+var.getNume()+" este: "+nrPlaci);
        }
    }
}
