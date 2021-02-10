###Exceptions

- IndexOutOfBoundException
- ParseException
- ArrayStoreException
- NullPointerException
- ClassCastException
- NumberFormatException


Debugging and troubleshooting -> process of finding the root cause of an issue. goal is to fix a problem.



###StackTrace
Trace to the place where the exception was thrown.



###Unchecked Exceptions do not have to be handled or declared

List of Unchecked(Runtime Exceptions) 

- IndexOutOfBoundException
- NullPointerException
- Arithmetic Exception


###Checked Exceptions have to be handled or declared

Handled means the code that throws a checked exception is wrapped inside a try catch block

        try {
            FileWriter fileWriter = new FileWriter(path, true);

            fileWriter.write(txt);
            fileWriter.close();
        } catch (IOException io) {
            System.out.println("Catch in a method");
        }
        
        
 Declaring an exception means putting throws Exception keyword in the method declaration
 
        public static void writeToFile(String txt) throws IOException {
               FileWriter fileWriter = new FileWriter("12/32/test.txt",true);
       
               fileWriter.write(txt);
               fileWriter.close();
           }