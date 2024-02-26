package app.view;

import app.entitis.UserEntity;

import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class AppView {
    public void getAllItems(Collection<UserEntity> contactEntitis) {
        AtomicInteger atomicInteger = new AtomicInteger();
        contactEntitis.forEach((value) ->
                System.out.println(atomicInteger.incrementAndGet() + " ) " + value.getName()+" "+value.getEmail())

        );
    }

    public String getMenu() {
        Supplier<String> supplier=()->{
            System.out.println(
                    """ 
                                Menu:
                                1-get All
                                2-get filter data
                                3-exit
                        """);
            return  new Scanner(System.in).next();
        };

        return supplier.get();
    }
    public void getOutput(String text){
        System.out.println(text);
    }

}
