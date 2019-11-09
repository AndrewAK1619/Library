package io;

/* Andrzej Kamiński */

import model.*;

import java.util.Collection;

public class ConsolePrinter {

    public void printBooks(Collection<Publication> publications) {
        long count = publications.stream()
                .filter(p -> p instanceof Book)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (count == 0)
            printLine("Brak książek w bibliotece");
    }

    //powyższy kod wykorzystuje strumienie, zapis działa identycznie jak kod niżej zakomentowany - zostawiam oba
    //w celach edukacyjnych

//    public void printBooks(Collection<Publication> publications) {
//        int counter = 0;
//        for (Publication publication : publications) {
//            if(publication instanceof Book) {
//                printLine(publication.toString());
//                counter++;
//            }
//        }
//        if (counter == 0)
//            printLine("Brak książek w bibliotece");
//    }

    public void printMagazines(Collection<Publication> publications) {
        long count = publications.stream()
                .filter(p -> p instanceof Magazine)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
        if (count == 0)
            printLine("Brak magazynów w bibliotece");
    }

    //powyższy kod wykorzystuje strumienie, zapis działa identycznie jak kod niżej zakomentowany - zostawiam oba
    //w celach edukacyjnych

//    public void printMagazines(Collection<Publication> publications) {
//        int counter = 0;
//        for (Publication publication : publications) {
//            if(publication instanceof Magazine) {
//                printLine(publication.toString());
//                counter++;
//            }
//        }
//        if (counter == 0)
//            printLine("Brak magazynów w bibliotece");
//    }

    public void printUsers(Collection<LibraryUser> users) {
        users.stream()
                .map(User::toString)
                .forEach(this::printLine);
    }

    //powyższy kod wykorzystuje strumienie, zapis działa identycznie jak kod niżej zakomentowany - zostawiam oba
    //w celach edukacyjnych

//    public void printUsers(Collection<LibraryUser> users) {
//        for (LibraryUser user : users) {
//            printLine(user.toString());
//        }
//    }

    public void printLine(String text) {
        System.out.println(text);
    }
}
