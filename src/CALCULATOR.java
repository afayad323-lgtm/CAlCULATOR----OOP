public class CALCULATOR {
    private double lastResult;
    private String[] history = new String[10];
    private int index = 0;

    private void saveHistory(String operation){
        history[index] = operation;
        index++;
        if (index == 10){
            index = 0;
        }
    }


    public double add(double a , double b){
        lastResult = a+b;
        saveHistory(a + " + " + b + " = " + lastResult);

        return lastResult;

    }
    public double sub(double a , double b){
        lastResult = a-b;
        saveHistory(a + " - " + b + " = " + lastResult);
        return lastResult;

    }
    public double multiply(double a , double b){
        lastResult =  a * b;
        saveHistory(a + " * " + b + " = " + lastResult);
        return lastResult;

    }
    public double divide(double a , double b){
        lastResult= a / b;
        saveHistory(a + " / " + b + " = " + lastResult);
        return lastResult;

    }

    public double getLastResult() {
        return lastResult;
    }
    public void clearLastResult(){
    lastResult = 0;
    }

    public void showHistory() {
        for (int i = 0; i < history.length; i++) {
            if (history[i] != null) {
                System.out.println(history[i]);
            }
        }
    }


}
