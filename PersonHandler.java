 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String currentperson = "";
        // assume there is a `counter`
        int count =0;
        
        // while `counter` is less than length of array
        while(count<personArray.length)
        {
            // begin loop
             currentperson = currentperson+personArray[count]; 
                 count++  ; 
            // end loop
        }
        return currentperson;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int i =0;
        int n = personArray.length;
        
        
        for(i=0;i<n;i++){
            result = result+personArray[i];
        }

        
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person p:personArray)
        {
            result=result+p;
        }
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
