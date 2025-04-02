public class InvalidParamException extends Exception {
    
    String msg = "The second parameter need to be greater than first.";

    @Override
    public String toString() {
        return "InvalidParamException [ " + msg +  " ]";
    }
       
}