class ReverseString {

    String reverse(String inputString) {
        // "cool" = "looc"
        String outputString = "";
        for(int i=inputString.length()-1;i>=0;i--) {
            outputString = outputString + inputString.charAt(i);
        }
        return outputString;
    }
  
}
