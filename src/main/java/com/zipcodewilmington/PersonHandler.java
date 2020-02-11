package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int i = 0;          // create a `counter`
        while ( i < personArray.length) {
 // while `counter` is less than length of array
            result = result + personArray[i];    /* begin loop */
            i++;}

                /*
                 use `counter` to identify the `current Person` in the array
                 get `string Representation` of `currentPerson`
                 append `stringRepresentation` to `result` variable
                 end loop
                */

        return result;
    }



    public String forLoop() {
            String result = "";
            for (int i = 0; i < personArray.length; i++) {
                result = result + personArray[i];
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

            String result1 = result;
            return result1;
    }



    public String forEachLoop() {
        String result = "";
        for (Person item : personArray) {
            result = result + item;
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
