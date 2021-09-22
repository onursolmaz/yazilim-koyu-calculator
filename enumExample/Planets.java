package com.renova.enumExample;

enum Planets {
    MERCURY, VENUS, MOON, MARS, JUPITER, SATURN, URANUS, NEPTUNE, PLUTO,SUN;
    private static double G=9.81;

    public static double calculate(Planets planet, Double weight) {
        double result;
        switch (planet){
            case SUN:
                result=(247.2/G)*weight;
                break;
            case MARS:
                result=(3.77/G)*weight;
                break;
            case MOON:
                result=(1.62/G)*weight;
                break;
            case PLUTO:
                result=(0.06/G)*weight;
                break;
            case VENUS:
                result=(8.87/G)*weight;
                break;
            case SATURN:
                result=(9.2/G)*weight;
                break;
            case URANUS:
                result=(8.69/G)*weight;
                break;
            case JUPITER:
                result=(23.30/G)*weight;
                break;
            case MERCURY:
                result=(3.70/G)*weight;
                break;
            case NEPTUNE:
                result=(11/G)*weight;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + planet);
        }
        return result;
    }

}


