public enum Directions {
    NORTH("Północ"),
    EAST("Południe"),
    SOUTH("Wschód"),
    WEST("Zachód");

    private final String directionsPl;

    private Directions(String directionsPl) {
        this.directionsPl = directionsPl;
    }

    public void printDirections(){
        System.out.println("Ok więc jedziemy na " + this.directionsPl);
    }
}
