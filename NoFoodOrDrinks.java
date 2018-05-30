class NoFoodOrDrinks {
    public static void main(String[] args) {
        System.out.print("no food or drinks: !food||drinks\n\n");

        String sb;
        BooleanOperation o = new NotAOrB();
        String[] Operands = {"Food", "Drinks"};
        TruthTable tt = new TruthTable(
                o, Operands,
                "No Food or Drinks");
        System.out.println(tt.toString());

        System.exit(0);
    }
}
