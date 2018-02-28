package sample;

 // logic for calculator



class Logic {

    private double outcomeOutput;
    private double outcomeInput;
    private String ValueOutput;
    private String ValueInput;
    private double result;


    // setters and getters


    private void setValueOutput(String output){
        this.ValueOutput = output;
    }
    private void setValueInput (String input){
        this.ValueInput = input;
    }
    private String getValueInput(){
        return ValueInput;
    }
     String getValueOutput() {
        return ValueOutput;
    }

    private void ValueInputToDouble(){
        double input = Double.parseDouble(getValueInput());
        this.outcomeInput = input;
    }
    private void ValueOutputToDouble () {
        double output = Double.parseDouble(getValueOutput().substring(0,getValueOutput().length()-1));
        this.outcomeOutput = output;
    }

    private double getOutcomeOutput(){
        return outcomeOutput;
    }
    private double getOutcomeInput(){
        return outcomeInput;
    }
    private void resultToString(){
        setValueOutput(Double.toString(getOutcomeOutput()));
    }
    private void setResult(double result){
        this.result = result;
    }
    double getResult(){
        return result;
    }

    // Math functions
    // simple

     private void addition (double x, double y){
         setResult(x+y);
     }
     private void multiply (double x, double y){
         setResult(x*y);
     }
     private void diverse (double x, double y) {
         setResult(x/y);
     }
     private void subtraction (double x, double y) {
         setResult(x-y);
     }

     //count function

     private void count(double x, double y){
         switch (getValueOutput().substring(getValueOutput().length()-1,getValueOutput().length())){
             case "+":
                 addition(x,y);
                 break;
             case "-":
                 subtraction(x,y);
                 break;
             case "*":
                 multiply(x,y);
                 break;
             case "/":
                 diverse(x,y);
                 break;
         }
     }
     void calc (String input, String output){
        setValueInput(input);
        setValueOutput(output);
        ValueInputToDouble();
        ValueOutputToDouble();
        count(getOutcomeOutput(),getOutcomeInput());
        resultToString();

     }
}
