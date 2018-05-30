public class TruthTable {
    private BooleanOperation operation;
    private String[] operandNames;
    private String outputName;

    public TruthTable(BooleanOperation operation,
            String[] operandNames,
            String output)
    {
        this.operation = operation;
        this.operandNames = operandNames;
        this.outputName = output;
    }

    public String toString() {
        // Header
        StringBuilder sb = new StringBuilder();
        for (String s : operandNames) {
            sb.append(s);
            sb.append("\t");
        }
        sb.append(outputName);
        sb.append("\n");

        // Body
        boolean[] b = new boolean[3];
        while (operation.nextValue()) {
            try {
                b = operation.getTruthValues();
            } catch (Exception e) {
                // Never happens
                System.err.println("Impossible condition!");
                System.exit(1);
            }
            for (int i = 0; i < b.length; ++i) {
                sb.append(b[i] ? 1 : 0);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
