
package test.pkg1.java;

/**
 *
 * @author Nurul.Nadia.Idris
 * For Test 1 Write and Read Binary Mode
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
                Biodata nadia = new Biodata();
		nadia.name="Nurul Nadia Idris";
		nadia.matrix=2014243398;
		nadia.age=27;
		nadia.email="n.nadiaidris@gmail.com";
		nadia.mobile=4727861;
		
		System.out.println("Writing Binary File nadia.bin");
		String filename="nadia.bin";
                
                try {
                   
                    try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename))) {
          
                        os.writeObject(nadia);
                    }
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		System.out.println("Done Writing");
		
                System.out.println("Reading Binary File nadia.bin");
		try {
                    try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename))) {
                        Biodata b = (Biodata) is.readObject();
                        System.out.println("Read Name = "+b.name);
                        System.out.println("Read Matrix = "+b.matrix);
                        System.out.println("Read Age = "+b.age);
                        System.out.println("Read Email = "+b.email);
                        System.out.println("Read Mobile = "+b.mobile);
                    }
			
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
                }
    }
    
}
