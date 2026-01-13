// Base class using arrays (simplified)
import java.util.ArrayList;
import java.util.List;
public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;

    protected String[] categories;
    protected double[] categoryLimits;

    protected double totalExpenses = 0; // Just store total expense
	
	 protected List<Transaction> transactions = new ArrayList<>();
    // Constructor with custom categories
    public Budget(double income, double limit, String[] categories, double[] categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categories = categories;
        this.categoryLimits = categoryLimits;
    }
	
	public void addTransaction(Transaction t) {
    transactions.add(t);
    totalExpenses += t.getAmount();
}

    // Controlled expense entry (encapsulation)
    public void addExpense(double amount) {
        if (amount > 0) {
            totalExpenses += amount;
        }
    }

    // Calculate total expenses (no loop, very easy)
    protected double getTotalExpenses() {
        return totalExpenses;
    }

    // Operator usage: net savings
    public double calculateNetSavings() {
        return income - totalExpenses;
    }
}
