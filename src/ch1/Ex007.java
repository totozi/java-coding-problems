package ch1;

public class Ex007 {
    public static void main(String[] args) {

        System.out.println(convertFromStringToNumber("123", Integer.class));
        System.out.println(convertFromStringToNumber("1123412122413411111", Long.class));
        System.out.println(convertFromStringToNumber("123.1342", Float.class));
        System.out.println(convertFromStringToNumber("123.32143412341234123412", Double.class));
        
    }

    private static Number convertFromStringToNumber(String str, Class<? extends Number> obj) {

        // System.out.println(obj.getSimpleName());

        switch (obj.getSimpleName()) {
            case "Integer":
                return Integer.parseInt(str);
            case "Long":
                return Long.parseLong(str);
            case "Float":
                return Float.parseFloat(str);

            case "Double":
                return Double.parseDouble(str);
            default:
                break;
        }
        return null;
    }
}
