package lab4;
/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */


public class VendingMachine {
    // TODO: implement this class
    private int price;
    private String product;
    private int CheetosCrunchy;
    private int Coke;
    private int DoritosNachoCheese;
    private int RedBull;
    private String Msg;


    public VendingMachine() {
        
        this.Msg = "Empty VM Started";

    }


    public String checkStock() {
        return "Stock: Cheetos Crunchy " + "(" + this.CheetosCrunchy + ")" + ", " + "Coke " + "(" + this.Coke + ")" + ", " +  "Doritos Nacho Cheese " + "(" + this.DoritosNachoCheese + "), " + "Red Bull" + " (" + this.RedBull +")";

    }

    public String checkStock(String product) {

        return switch (product) {
            case "Coke" -> "Coke " + "(" + this.Coke+ ")";
            case "Cheetos Crunchy" -> "Cheetos Crunchy " + "(" + this.CheetosCrunchy + ")";
            case "Doritos Nacho Cheese" -> "Doritos Nacho Cheese " + "(" + this.DoritosNachoCheese + ")";
            case "Red Bull" -> "Red Bull " + "(" + this.RedBull + ")";
            default -> "Invalid product: " + product;
        };
    }


    public void add(String product, int price) {
        this.product = product;
        this.price = price;
        switch (product) {
            case "Coke" -> {
                this.Coke += price;
                this.Msg = "Product added: " + this.product + " (" + this.price + ")";
            }
            case "Doritos Nacho Cheese" -> {
                this.DoritosNachoCheese += price;
                this.Msg = "Product added: " + this.product + " (" + this.price + ")";
            }
            case "Red Bull" -> {
                this.RedBull += price;
                this.Msg = "Product added: " + this.product + " (" + this.price + ")";
            }
            case "Cheetos Crunchy" -> {
                this.CheetosCrunchy += price;
                this.Msg = "Product added: " + this.product + " (" + this.price + ")";
            }
            default -> this.Msg = "Invalid product: " + product;
        }



    }

    public void dispense(String product, int price) {
        this.product = product;
        this.price = price;
        switch (product) {
            case "Coke" -> {
                this.Coke -= price;
                this.Msg = "Product removed: " + this.product + " (" + this.price + ")";
            }
            case "Doritos Nacho Cheese" -> {
                this.DoritosNachoCheese -= price;
                this.Msg = "Product removed: " + this.product + " (" + this.price + ")";
            }
            case "Red Bull" -> {
                this.RedBull -= price;
                this.Msg = "Product removed: " + this.product + " (" + this.price + ")";
            }
            case "Cheetos Crunchy" -> {
                this.CheetosCrunchy -= price;
                this.Msg = "Product removed: " + this.product + " (" + this.price + ")";
            }
            default -> this.Msg = "Invalid product: " + product;
        }

    }

        public String getMessage() {
            return this.Msg;

        }
    }



