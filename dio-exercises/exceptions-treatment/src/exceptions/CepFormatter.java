package exceptions;

public class CepFormatter {

    public static void main(String[] args) {
        try {
            String formatedCep = formatCep("2347891");
            System.out.println(formatedCep);
        } catch (InvalidCepException e) {
            e.printStackTrace();
        }
        
    }
    
    
    static String formatCep(String cep) throws InvalidCepException {
        if(cep.length() != 8) {
            throw new InvalidCepException();
        }
        // simulating a formated cep
        return "23.478-910";
    }
}