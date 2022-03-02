package service;

public class ServiceImpl implements ServiceCalculate {
    public ServiceImpl() {
    }

    @Override
    public String calculate(Double first, Double second, String calculate) {

        String result = "";
        switch (calculate) {
            case "Addition(+)":
                result = String.valueOf((first + second));
                break;
            case "Subtraction(-)":
                result = String.valueOf((first - second));
                break;
            case "Multiplication(x)":
                calculate = "Multiplication";
                result = String.valueOf((first * second));
                break;
            case "Division(/)":
                if (second == 0) {
                    result = "Mẫu số không được là số '0'. Mời nhập lại";
                    break;
                } else {
                    result = String.valueOf((first / second));
                    break;
                }
        }
        return result;
    }
    public String calculator(Double second,String calculate) {
        switch (calculate) {
            case "Addition(+)":
                calculate = "Addition";
                break;
            case "Subtraction(-)":
                calculate = "Addition";
                break;
            case "Multiplication(x)":
                calculate = "Addition";
                break;
            case "Division(/)":
                calculate = "Division";
                if (second == 0) {
                    calculate = "Error:";
                    break;
                }
        }
        return calculate;
    }
}