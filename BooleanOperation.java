public interface BooleanOperation {
    /// @return: boolean[]. Value of all input operands then the last element
    /// the value of the operation's ouput 
    public boolean[] getTruthValues() throws Exception;
    public boolean nextValue();
}
