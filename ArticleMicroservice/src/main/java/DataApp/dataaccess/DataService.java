package DataApp.dataaccess;

import org.springframework.stereotype.Service;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

@Service
public class DataService {

    public Optional<Animal> getById(final String id){
        File file  = new File("src\\main\\resources\\AnimalsForSale.txt");

        try (Scanner scanner = new Scanner(file).useLocale(Locale.US)){
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                if (scanner.next().equals("id"+id)){
                    return Optional.of(new Animal(Integer.valueOf(id), scanner.next(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextDouble()));
                }
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }
        return Optional.empty();
    }
}
