//Controlle class for GUI

package sample;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;


public class Controller {
     Logic log = new Logic();   // new logic


    // Buttons
    public Button one,two,three,four,five,six,seven,eight,nine,zero;
    public Button dot,multi,div,plus,minus,CC,C,perc,sin,PM,equal;
    // labels and text fields
    public TextField input;
    public Label output;
    private boolean inputEmpty = true;
    private boolean outputEmpty = true;
    private boolean dotClick = false;
    private boolean equalClick = false;


    //setters and getters for Labels, Text fields and booleans

     void setInputEmptyFalse(){
         inputEmpty = false;

     }
     void setInputEmptyTrue(){
         inputEmpty = true;
     }
     void setOutputEmptyFalse(){
         outputEmpty = false;
     }
     void setOutputEmptyTrue(){
         outputEmpty = true;
     }
     void setDotClick(boolean wartosc){
         dotClick = wartosc;
     }
     void setInput(String input){
         this.input.setText(input);
     }
     void setEqualClick(boolean wartosc){
         equalClick = wartosc;
     }

     String getInput(){
      return input.getText();

     }

     void setOutput(String output){
         this.output.setText(output);

     }

     String getOutput(){
         return output.getText();
     }

    //Actions on buttons clicks


    public void buttonZeroClick(){
         if(inputEmpty == true) {
             setInput("0");
             setInputEmptyFalse();
         }
         else if (inputEmpty == false)
             setInput(getInput()+"0");
    }

    public void buttonOneClick(){
        if(inputEmpty == true) {
            setInput("1");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"1");
    }

    public void buttonTwoClick(){
        if(inputEmpty == true) {
            setInput("2");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"2");
    }
    public void buttonThreeClick(){
        if(inputEmpty == true) {
            setInput("3");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"3");
    }
    public void buttonFourClick(){
        if(inputEmpty == true) {
            setInput("4");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"4");
    }
    public void buttonFiveClick(){
        if(inputEmpty == true) {
            setInput("5");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"5");
    }
    public void buttonSixClick(){
        if(inputEmpty == true) {
            setInput("6");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"6");
    }
    public void buttonSevenClick(){
        if(inputEmpty == true) {
            setInput("7");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"7");
    }
    public void buttonEightClick(){
        if(inputEmpty == true) {
            setInput("8");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"8");
    }
    public void buttonNineClick(){
        if(inputEmpty == true) {
            setInput("9");
            setInputEmptyFalse();
        }
        else if (inputEmpty == false)
            setInput(getInput()+"9");
    }
    public void buttonDotClick(){
        if(inputEmpty == true && dotClick == false) {
            setInput("0.");
            setInputEmptyFalse();
            setDotClick(true);
        }
        else if (inputEmpty == false && dotClick == false) {
            setInput(getInput() + ".");
            setDotClick(true);
        }
    }
    public void buttonPlusClick(){
         if (equalClick == true) {
             setOutput(getOutput() + "+");
             setEqualClick(false);
         }
         if (inputEmpty == false){
             if (outputEmpty == true) {
                 setOutput(getInput() + "+");
                 setOutputEmptyFalse();
                 setInput(null);
                 setInputEmptyTrue();
                 setDotClick(false);
             }
             else if (outputEmpty == false){
                 log.calc(getInput(),getOutput());
                 setOutput(Double.toString(log.getResult()) + "+");
                 setInputEmptyTrue();
                 setInput(null);
                 setDotClick(false);
             }
         }
    }
    public void buttonMinusClick(){
        if (equalClick == true) {
            setOutput(getOutput() + "-");
            setEqualClick(false);
        }
        if (inputEmpty == false){
            if (getInput().equals("-"))
                setInput("-");
            else  if (outputEmpty == true  ) {
                if(getInput().equals("-"))
                    setInput("-");
                setOutput(getInput() + "-");
                setOutputEmptyFalse();
                setInput(null);
                setInputEmptyTrue();
                setDotClick(false);
            }
            else if (outputEmpty == false){
                log.calc(getInput(),getOutput());
                setOutput(Double.toString(log.getResult()) + "-");
                setInputEmptyTrue();
                setInput(null);
                setDotClick(false);
            }
        }
        else if (inputEmpty == true){
            setInput("-");
            setInputEmptyFalse();

        }
    }
    public void buttonMultiClick(){
        if (equalClick == true) {
            setOutput(getOutput() + "*");
            setEqualClick(false);
        }
        if (inputEmpty == false){
            if (outputEmpty == true) {
                setOutput(getInput() + "*");
                setOutputEmptyFalse();
                setInput(null);
                setInputEmptyTrue();
                setDotClick(false);
            }
            else if (outputEmpty == false){
                log.calc(getInput(),getOutput());
                setOutput(Double.toString(log.getResult()) + "*");
                setInputEmptyTrue();
                setInput(null);
                setDotClick(false);
            }
        }
    }
    public void buttonDivClick() {
        if (equalClick == true) {
                setOutput(getOutput() + "/");
                setEqualClick(false);
        }

            if (inputEmpty == false) {
                double test = Double.parseDouble(getInput());
                if (test != 0) {
                if (outputEmpty == true) {
                    setOutput(getInput() + "/");
                    setOutputEmptyFalse();
                    setInput(null);
                    setInputEmptyTrue();
                    setDotClick(false);
                } else if (outputEmpty == false) {
                    log.calc(getInput(), getOutput());
                    setOutput(Double.toString(log.getResult()) + "/");
                    setInputEmptyTrue();
                    setInput(null);
                    setDotClick(false);
                }
            }
                else if (test ==0){
                    JOptionPane.showMessageDialog(null,"Nie dziel przez 0 do chuja wafla");
                    setInput(null);
                    setInputEmptyTrue();
                    setDotClick(false);
                }
        }
    }
    public void buttonCcClick(){
         setOutputEmptyTrue();
         setInputEmptyTrue();
         setInput(null);
         setOutput(null);
         setDotClick(false);
         setEqualClick(false);

    }
    public void buttonCClick(){
         if (inputEmpty == false) {
             if (getInput().length() <= 1)
                 setInputEmptyTrue();
             if (getInput().substring(getInput().length() - 1, getInput().length()).equals("."))
                 setDotClick(false);
             setInput(getInput().substring(0, getInput().length() - 1));

         }
    }
    public void buttonPmClick(){
         if (outputEmpty == false)
         if (getOutput().substring(0,1).equals("-"))
             setOutput(getOutput().substring(1));
         else
             setOutput("-"+getOutput());
    }
    public void buttonPercClick(){
         double x = Double.parseDouble(getInput())/100;
         setInput(Double.toString(x));
         setDotClick(true);

    }
    public void buttonEqualClick(){
         if (outputEmpty == false && inputEmpty == false){
             log.calc(getInput(),getOutput());
             setOutput(Double.toString(log.getResult()));
             setInputEmptyTrue();
             setInput(null);
             setDotClick(false);
             setEqualClick(true);
         }

    }
    public void buttonSinClick(){
         setInput(Double.toString(Math.sin(Double.parseDouble(getInput()))));

    }
}
